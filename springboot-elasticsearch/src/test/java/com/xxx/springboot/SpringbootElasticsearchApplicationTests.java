package com.xxx.springboot;

import com.xxx.springboot.bean.Article;
import io.searchbox.client.JestClient;
import io.searchbox.core.Index;
import io.searchbox.core.Search;
import io.searchbox.core.SearchResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootElasticsearchApplicationTests {

    @Autowired
    JestClient JestClient;


    @Test
    public void contextLoads() throws IOException {
        Article article = new Article();
        article.setId(1);
        article.setTitle("号外");
        article.setAuthor("李萌");
        article.setContent("李恩GM充军");

        Index build =
                new Index.Builder(article).index("xxx").type("news").build();
        JestClient.execute(build);
    }

    @Test
    public void search() throws IOException {

        String json = "{\n" +
                "    \"query\": {\n" +
                "        \"match\": {\n" +
                "            \"content\": \"李\"\n" +
                "        }\n" +
                "    }\n" +
                "}";
        Search build = new Search.Builder(json).addIndex("xxx").addType("news").build();
        SearchResult execute = JestClient.execute(build);
        System.out.println(execute.getJsonString());
    }
}

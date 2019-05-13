package com.xxx.springboot.bean;

import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BookRepository extends ElasticsearchCrudRepository<Book, Integer> {

}

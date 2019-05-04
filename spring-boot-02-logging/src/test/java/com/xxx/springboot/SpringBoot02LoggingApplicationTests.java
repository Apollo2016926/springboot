package com.xxx.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02LoggingApplicationTests {

    private Logger logger = LoggerFactory.getLogger(SpringBoot02LoggingApplicationTests.class);

    /**
     * 日志级别由低到高
     * springboot默认info
     *
     */
    @Test
    public void contextLoads() {
        logger.trace("trace---日志-----");
        logger.debug("debug---日志-----");
        logger.info("info---日志-----");
        logger.warn("warn---日志-----");
        logger.error("error---日志-----");
    }

}

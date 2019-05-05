package com.xxx.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot02LoggingApplication {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(SpringBoot02LoggingApplication.class);

        logger.trace("trace------日志");
        logger.debug("debug------日志");
        logger.info("info------日志");
        logger.warn("warn------日志");
        logger.error("error------日志");
        SpringApplication.run(SpringBoot02LoggingApplication.class, args);
    }

}

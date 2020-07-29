package com.lovefn.demoproject.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Starting
 */
@Slf4j
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    /**
     * Starting
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        log.info("============== start finish ==================");
    }

}

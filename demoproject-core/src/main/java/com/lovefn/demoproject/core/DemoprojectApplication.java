package com.lovefn.demoproject.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Starting
 */
@SpringBootApplication
public abstract class DemoprojectApplication extends SpringBootServletInitializer {

    /**
     * Starting
     */
    public static void main(String[] args) {
        SpringApplication.run(DemoprojectApplication.class, args);
    }

}

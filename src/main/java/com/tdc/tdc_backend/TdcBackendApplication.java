package com.tdc.tdc_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class TdcBackendApplication extends SpringBootServletInitializer {
    private static final Logger logger = LoggerFactory.getLogger(TdcBackendApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(TdcBackendApplication.class, args);
        logger.info("TdcBackendApplication has started successfully.");
    }
}

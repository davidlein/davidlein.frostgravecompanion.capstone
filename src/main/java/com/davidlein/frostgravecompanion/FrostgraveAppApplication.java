package com.davidlein.frostgravecompanion;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class FrostgraveAppApplication
{
    private static final Logger LOGGER = LoggerFactory.getLogger(FrostgraveAppApplication.class);
    public static void main(String[] args)
    {

        SpringApplication.run(FrostgraveAppApplication.class, args);
        LOGGER.error("Message logged at ERROR level");
        LOGGER.warn("Message logged at WARN level");
        LOGGER.info("Message logged at INFO level");
        LOGGER.debug("Message logged at DEBUG level");
    }

}

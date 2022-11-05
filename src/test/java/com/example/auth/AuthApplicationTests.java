package com.example.auth;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AuthApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(AuthApplicationTests.class);
    @Test
    void contextLoads() {
        logger.info("work");
    }

}

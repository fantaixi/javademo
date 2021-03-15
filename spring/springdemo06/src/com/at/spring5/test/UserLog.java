package com.at.spring5.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author fantaixi
 * @create 2021-01-03 23:28
 */
public class UserLog {
    private static final Logger logger = LoggerFactory.getLogger(UserLog.class);

    public static void main(String[] args) {
        logger.info("info............");
        logger.warn("warn..............");
    }
}

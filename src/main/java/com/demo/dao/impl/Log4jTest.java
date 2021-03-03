package com.demo.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 单独使用log4j实例
 */
public class Log4jTest {

   Logger log2 = LoggerFactory.getLogger(Log4jTest.class);
    public void log() {


        log2.debug("Debug info.");
        log2.info("Info info");
        log2.warn("Warn info");
        log2.error("Error info");

    }

    public static void main(String[] args) {
        Log4jTest test = new Log4jTest();
        test.log();
    }
}
package com.spi.provider;

import com.spi.Logger;

/**
 * Logger 实现 1，名字叫 Logback
 */
public class Logback implements Logger {

    @Override
    public void debug(String message) {
        System.out.println("Logback debug 打印日志：" + message);
    }

    @Override
    public void info(String message) {
        System.out.println("Logback info 打印日志：" + message);
    }

}

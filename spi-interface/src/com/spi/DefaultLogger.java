package com.spi;

public class DefaultLogger implements Logger {

    @Override
    public void debug(String message) {
        System.out.println("debug 中没有发现 Logger 服务提供者.");
    }

    @Override
    public void info(String message) {
        System.out.println("info 中没有发现 Logger 服务提供者.");
    }

}

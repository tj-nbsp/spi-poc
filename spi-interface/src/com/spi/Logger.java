package com.spi;

/**
 * 日志处理接口，日志级别小的方法定义位置靠上
 */
public interface Logger {

    void debug(String message);

    void info(String message);

}

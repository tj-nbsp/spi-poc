package com.spi;

import java.util.List;

public class SpiLogger implements Logger {

    private static final DefaultLogger DEFAULT_LOGGER = new DefaultLogger();

    private final Logger logger; // the first ServiceLoader.

    private final List<Logger> loggerList; // all of ServiceLoader.

    SpiLogger(Logger logger, List<Logger> loggerList) {
        this.logger = logger;
        this.loggerList = loggerList;
    }

    @Override
    public void debug(String message) {
        if (loggerList.isEmpty()) {
            DEFAULT_LOGGER.debug(message);
        } else {
            loggerList.forEach(logger -> logger.debug(message));
        }
    }

    @Override
    public void info(String message) {
        if (logger == null) {
            DEFAULT_LOGGER.info(message);
        } else {
            logger.info(message);
        }
    }

}

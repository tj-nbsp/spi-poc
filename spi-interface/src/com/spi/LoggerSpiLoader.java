package com.spi;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class LoggerSpiLoader {

    private static final LoggerSpiLoader LOADER = new LoggerSpiLoader();
    private final SpiLogger spiLogger;

    private LoggerSpiLoader() {
        Logger firstLogger = null;
        List<Logger> loggerList =  new ArrayList<>();

        ServiceLoader<Logger> serviceLoader = ServiceLoader.load(Logger.class);
        for (Logger log : serviceLoader) {
            loggerList.add(log);
        }
        if (!loggerList.isEmpty()) {
            firstLogger = loggerList.get(0);
        }
        spiLogger = new SpiLogger(firstLogger, loggerList);
    }

    public static Logger getLogger() {
        return LOADER.spiLogger;
    }

}

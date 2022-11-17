package com.spi;

public class Main {

    public static void main(String[] args) {
        Logger logger = LoggerSpiLoader.getLogger();
        logger.debug("Hello SPI by debug message.");
        logger.info("Hello SPI by info message.");
    }

}
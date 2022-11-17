import com.spi.Logger;
import com.spi.LoggerSpiLoader;

public class Main {

    public static void main(String[] args) {
        Logger logger = LoggerSpiLoader.getLogger();
        logger.debug("你好");
        logger.info("测试 Service Provider Interface 机制.");
    }

}
package study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author：lyx
 * @date: 2021/11/3 12:04 上午
 * @version: 1.0
 */
@SpringBootApplication
public class StockApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(StockApplication.class,args);
    }
}

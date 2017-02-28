package io.dreampie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by wangrenhui on 2017/2/28.
 */
@SpringBootApplication(scanBasePackages = {"io.dreampie"})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}

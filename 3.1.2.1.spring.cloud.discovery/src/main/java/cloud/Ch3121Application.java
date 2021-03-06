package cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by XJX on 2017/6/18.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Ch3121Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch3121Application.class, args);
    }
}

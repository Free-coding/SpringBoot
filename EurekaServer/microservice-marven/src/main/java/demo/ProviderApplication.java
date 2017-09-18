package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by 吴文韬 on 2017/9/18.
 */
@SpringBootApplication
@ComponentScan("demo")
@EnableDiscoveryClient
public class ProviderApplication {
    public static void main(String[] args){
        SpringApplication.run(ProviderApplication.class,args);
    }
}

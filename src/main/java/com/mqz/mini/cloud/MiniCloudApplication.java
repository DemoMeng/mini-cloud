package com.mqz.mini.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author mqz
 * @since 2020年12月23日
 * @description nacos-client 注册中心
 * @abount https://github.com/DemoMeng
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MiniCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniCloudApplication.class, args);
    }

}

package com.fjmpaez;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import com.fjmpaez.pojo.Request;
import com.fjmpaez.queuing.Gateway;
import com.fjmpaez.queuing.Gateway2;

@SpringBootApplication
@EnableEurekaClient
@ImportResource("classpath:integration.xml")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    Gateway gateway;

    @Autowired
    Gateway2 gateway2;

    @Bean
    public CommandLineRunner runner() {
        return new CommandLineRunner() {

            @Override
            public void run(String... arg) throws Exception {
                gateway.send(new Request("1", "franUser", "week", "request_trx_id_123", "web"));
                gateway2.send(new Request("2", "franUser_2", "week", "request_trx_id_123", "web"));
            }
        };

    }

}

package com.texinc.loytesting.hrsystemplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@MapperScan("com.texinc.loytesting.hrsystemplus.mapper")
@EnableCaching
@SpringBootApplication
public class HrsystemplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrsystemplusApplication.class, args);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {

        PropertySourcesPlaceholderConfigurer c = new PropertySourcesPlaceholderConfigurer();

        c.setIgnoreUnresolvablePlaceholders(true);

        return c;
    }

}



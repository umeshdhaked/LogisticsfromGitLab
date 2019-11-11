package com.stackroute;

import com.stackroute.config.ConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigurationProperties(ConfigProperties.class)
@EnableEurekaClient
public class WysserApplication {

	public static void main(String[] args) {
		SpringApplication.run(WysserApplication.class, args);
	}

}

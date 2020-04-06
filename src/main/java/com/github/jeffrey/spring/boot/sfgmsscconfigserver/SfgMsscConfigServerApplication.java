package com.github.jeffrey.spring.boot.sfgmsscconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SfgMsscConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SfgMsscConfigServerApplication.class, args);
	}

}

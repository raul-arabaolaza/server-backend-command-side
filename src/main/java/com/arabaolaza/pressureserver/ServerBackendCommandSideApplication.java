package com.arabaolaza.pressureserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.eventuate.javaclient.spring.EnableEventHandlers;

@SpringBootApplication
@EnableEventHandlers
public class ServerBackendCommandSideApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerBackendCommandSideApplication.class, args);
	}
}

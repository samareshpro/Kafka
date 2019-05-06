package com.mc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.mc.main.controller.KafkaController;

@SpringBootApplication
//@ComponentScan({"com.mc.producer","com.mc.consumer","com.mc.controller","com.mc.entity"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

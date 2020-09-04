package com.mi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mi.demo.controller.HelloWorldController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		SpringApplication.run(HelloWorldController.class, args);
		System.out.println("Hello World !!!");
	}

}

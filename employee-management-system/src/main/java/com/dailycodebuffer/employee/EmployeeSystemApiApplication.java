package com.dailycodebuffer.employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeSystemApiApplication {

	public static void main(String[] args) {
		System.getProperties().put( "server.port", 80);
		SpringApplication.run(EmployeeSystemApiApplication.class, args);
	}
}

package com.java.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
public class SpringBootMysqlCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMysqlCrudApplication.class, args);
	}

}

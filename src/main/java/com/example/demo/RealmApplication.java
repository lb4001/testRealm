package com.example.demo;

import com.example.demo.dao.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RealmApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealmApplication.class, args);


	}

}

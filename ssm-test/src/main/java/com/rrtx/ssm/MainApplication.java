package com.rrtx.ssm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.annotation.PostConstruct;

/**
 * @author 申劭明
 * @date 2021/9/2 14:11
 */
@SpringBootApplication
public class MainApplication {

	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class);
	}

	@PostConstruct
	void sout() {
		for (String name : applicationContext.getBeanDefinitionNames()) {
			System.out.println("name = " + name);
		}
	}
}

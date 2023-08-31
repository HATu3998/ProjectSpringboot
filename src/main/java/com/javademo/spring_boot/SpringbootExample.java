package com.javademo.spring_boot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ApplicationContext context= SpringApplication.run(SpringbootExample.class, args);
 
 Dress d=context.getBean(Dress.class);
 d.wear();
	}

}

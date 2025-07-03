package com.example.DemoProject.Demo.Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoProjectApplication {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(appConfig.class);
		car car  = context.getBean("myCar", car.class);


//		SpringApplication.run(DemoProjectApplication.class, args);
//		ApplicationContext  context = new ClassPathXmlApplicationContext("beans.xml");
//		car car = context.getBean("myCar",car.class);
		car.drive();
	}

}




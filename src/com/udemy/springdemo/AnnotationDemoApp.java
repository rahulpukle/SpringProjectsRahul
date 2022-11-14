package com.udemy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach myCoach = context.getBean("tennisCoach",Coach.class);
		System.out.println(myCoach.getDailyWorkout());
		
		context.close();

	}

}

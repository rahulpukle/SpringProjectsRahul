package com.udemy.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigAnnotationDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);
		Coach myCoach = context.getBean("tennisCoach",Coach.class);
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		context.close();

	}

}

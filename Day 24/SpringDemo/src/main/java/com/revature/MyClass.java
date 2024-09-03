package com.revature;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClass {
public static void main(String[] args) {
	/*
	 * BaseBallCoach bCoach=new BaseBallCoach();
	 * System.out.println(bCoach.getDailyWorkout());
	 * 
	 * CricketCoach cCoach=new CricketCoach();
	 * System.out.println(cCoach.getDailyWorkout());
	 */
	
	// Creating Spring Container
	ClassPathXmlApplicationContext container=
			new ClassPathXmlApplicationContext("applicationContext.xml");
	
		BaseBallCoach bObj=	container.getBean("bCoach",BaseBallCoach.class);
		CricketCoach cObj=container.getBean("cCoach",CricketCoach.class);
		
		System.out.println(bObj.getDailyWorkout());
		System.out.println(cObj.getDailyWorkout());
		
			
		container.close();
}
}
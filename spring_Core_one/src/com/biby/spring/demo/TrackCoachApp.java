package com.biby.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TrackCoachApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
       
       Coach trackcoCoach=context.getBean("myTrack",Coach.class);
       System.out.println(trackcoCoach.getDailyworkout());
       context.close();
	}

}

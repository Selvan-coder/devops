package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainjava {
	
	public static void main(String args[])
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
		Student stud=(Student)context.getBean("stud");
		stud.display();
		//System.out.println(stud);
	}

}
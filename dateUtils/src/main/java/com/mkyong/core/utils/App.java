package com.mkyong.core.utils;

import org.joda.time.LocalDate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.knightspot.HelloWorld;

public class App {

	private static final Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {

		System.out.println(getLocalCurrentDate());
		
		ApplicationContext context = 
	             new ClassPathXmlApplicationContext("Beans.xml");

	      HelloWorld obj = (HelloWorld) context.getBean("first");

	      logger.info( "I have got the message:"+ obj.getMessage());
	      
	}

	private static String getLocalCurrentDate() {

		if (logger.isInfoEnabled()) {
			logger.info("getLocalCurrentDate() is executed!");
		}

		LocalDate date = new LocalDate();
		return date.toString();

	}

}

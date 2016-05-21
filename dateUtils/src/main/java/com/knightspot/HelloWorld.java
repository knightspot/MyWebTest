package com.knightspot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {

	String message;
	private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);
	
	public String getMessage() {
		logger.info("getMessage("+message+")");
		return message;
	}

	public void setMessage(String message) {
		logger.info("setMessage("+message+")");
		this.message = message;
	}
}

package com.thakurn.messages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultMessage {
	private final static Logger logger = LoggerFactory.getLogger(DefaultMessage.class);
	private String message = "Naveen Rocks!";

	public String getMessage(){
		logger.debug("message = xxxxxxxxxxxxxxxxxxxxxxx" );
		return message;
	}

	public void setMessage(String message){
		this.message = message;
	}

}
   
package com.fancye.sender;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.MessageCreator;

public class SenderMessageCreator implements MessageCreator {

	private String text;
	
	public SenderMessageCreator(String text){
		this.text = text;
	}
	
	public Message createMessage(Session session) throws JMSException {
		return session.createTextMessage(text);
	}

}

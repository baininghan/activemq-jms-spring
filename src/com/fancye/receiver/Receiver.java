package com.fancye.receiver;

import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.jms.core.JmsTemplate;

public class Receiver {

	public Receiver() {}
	
	private JmsTemplate jmsTemplate;

	public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	public String receiveMessage() throws JMSException {
		String msg = "";
		while(true){
			// 从指定管道 "first_queue" 获取消息
			// TextMessage text = (TextMessage) jmsTemplate.receive(new ActiveMQQueue("first_queue"));
			TextMessage text = (TextMessage) jmsTemplate.receive();
			if (null != text) {
				msg = text.getText();
			} else {
				break;
			}
		}
		
		return msg;
	}

}


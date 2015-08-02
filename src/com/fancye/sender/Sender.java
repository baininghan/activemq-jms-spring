package com.fancye.sender;

import javax.jms.Destination;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.jms.core.JmsTemplate;

public class Sender {

	private JmsTemplate jmsTemplate;

	public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}
	
	public void send(SenderMessageCreator senderMessageCreator){
		// ��ָ��Ŀ�ĵ� "first_queue" ������Ϣ
		// jmsTemplate.send(new ActiveMQQueue("first_queue"), senderMessageCreator);
		jmsTemplate.send(senderMessageCreator);
	}
}

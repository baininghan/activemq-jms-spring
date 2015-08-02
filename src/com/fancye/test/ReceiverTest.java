package com.fancye.test;

import javax.jms.JMSException;

import com.fancye.receiver.Receiver;
import com.fancye.util.SpringUtil;

public class ReceiverTest {

	public static void main(String[] args) throws JMSException {
		Receiver receiver = (Receiver)SpringUtil.getBean("receiver");
		
		System.out.println("Receiver get msg");
		System.out.println(receiver.receiveMessage());
	}
}

package com.fancye.test;

import com.fancye.sender.Sender;
import com.fancye.sender.SenderMessageCreator;
import com.fancye.util.SpringUtil;


public class SenderTest {

	public static void main(String[] args) {
		Sender sender = (Sender)SpringUtil.getBean("sender");
		SenderMessageCreator senderMessageCreator = new SenderMessageCreator("Fancye");
		sender.send(senderMessageCreator);
		
		System.out.println("Sender send msg ");
	}

}

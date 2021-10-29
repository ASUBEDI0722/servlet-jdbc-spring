package com.ektha.app.printer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ektha.app.provider.IMessageProvider;

@Component
public class MessagePrinter {
	
	@Autowired
	@Qualifier("dBMessageProvider")
	
	IMessageProvider messageProvider;
	
	public void printMessage() {
		
		System.out.println(messageProvider.fetchMeassage());
	}
	
	public void setMessageProvider(IMessageProvider messageProvider) {
		
		this.messageProvider = messageProvider;
	}
	
	

}

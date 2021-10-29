package com.ektha.app.provider;

import org.springframework.stereotype.Component;

@Component

public class DBMessageProvider implements IMessageProvider {

	@Override
	public String fetchMeassage() {

		System.out.println("DBMessageProvider : fetchMessage()");

		return "data: Welcome to interface ";

	}

}

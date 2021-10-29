package com.ektha.app.provider;

import org.springframework.stereotype.Component;

@Component

public class FileMessageProvider implements IMessageProvider {

	@Override
	public String fetchMeassage() {

		System.out.println("FileMessageProvider : fetchMessage()");

		return "file: Welcome to interface ";
	}

}

package com.ektha.app.dao;

import org.springframework.stereotype.Component;

@Component		//Container initialize the bean and managing the life cycle

public class MessageDAO {
	
	public String fetchMessage() {
		
		return "Spring is enterprise ready framework";
	}

}

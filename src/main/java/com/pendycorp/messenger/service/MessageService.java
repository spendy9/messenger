package com.pendycorp.messenger.service;

import java.util.ArrayList;
import java.util.List;

import com.pendycorp.messenger.model.Message;

public class MessageService {

	public List<Message> getAllMessages(){
		Message m1 = new Message(1L, "Hello World!", "World");
		Message m2 = new Message(2L, "Hello Srinath!", "Srinath");
		Message m3 = new Message(3L, "Hello Bhavya!", "Bhavya");
		
		List<Message> returnList = new ArrayList();
		returnList.add(m1);
		returnList.add(m2);
		returnList.add(m3);
		
		return returnList;
	}
}

package com.pendycorp.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.pendycorp.messenger.model.Message;
import com.pendycorp.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {

	MessageService service = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages(){
		
		return service.getAllMessages();
	}
}

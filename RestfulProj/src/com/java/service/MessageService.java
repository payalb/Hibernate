package com.java.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.java.dao.MyDatabase;
import com.java.exception.InvalidResponseException;
import com.java.model.Message;

public class MessageService {
	
	private 	Map<Long, Message> map= MyDatabase.getMapMessage();
	public List< Message> getMessages(){
		List<Message> message= new ArrayList<Message>();
		message.addAll(map.values());
		return message;
	}
	
	public List< Message> getMessagesForAuthor(String author){
		List<Message> messageList= new ArrayList<Message>();
		for(Message message:map.values()){
			if(message.getAuthor().equalsIgnoreCase(author)){
				messageList.add(message);
			}
		}
		
		return messageList;
	}
	
	public List< Message> getMessagesWithinIds(Long id, int size){
		List<Message> messageList= new ArrayList<Message>(size+1);
		for(int x=0; x<=size; id++, x++){
				Message message=map.get(id);
		
				messageList.add(message);
			}
		
		
		return messageList;
	}
	
	/*
	 * If id does not exist returns null, no response, 204 error
	 * After throwing exception, we see error in response page
	 */
	public Message getMessage(Long id) {	
		if(map.get(id)==null){
			System.out.println("Invalid id");
			throw new InvalidResponseException("Invalid id passed");
		}
		return map.get(id);
	}
	
	public void addMessage(Message m){
		map.put(m.getId(), m);
	}
	
	public void updateMessage(Message m){
		map.put(m.getId(), m);
	}

	public void removeMessage(Long id){
		map.remove(id);
	}
}

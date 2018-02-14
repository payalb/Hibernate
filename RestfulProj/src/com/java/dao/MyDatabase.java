package com.java.dao;

import java.util.HashMap;
import java.util.Map;

import com.java.model.Message;
import com.java.model.Profile;

public class MyDatabase {
	
	
	private static Map<Long, Message> mapMessage= new HashMap<Long, Message>();
	private static Map<String, Profile> mapProfile= new HashMap<String, Profile>();
	public static Map<Long, Message> getMapMessage() {
		return mapMessage;
	}
	public static void setMapMessage(Map<Long, Message> mapMessage) {
		MyDatabase.mapMessage = mapMessage;
	}
	public static Map<String, Profile> getMapProfile() {
		return mapProfile;
	}
	public static void setMapProfile(Map<String, Profile> mapProfile) {
		MyDatabase.mapProfile = mapProfile;
	}
	static{
		Message m1= new Message(1l, "Hello World1", "payal1");
		Message m2= new Message(2l, "Hello World2", "payal2");
		mapMessage.put(m1.getId(), m1);
		mapMessage.put(m2.getId(), m2);
	}
}

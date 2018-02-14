package com.java.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.java.dao.MyDatabase;
import com.java.model.Profile;

public class ProfileService {

	private Map<String, Profile> map = MyDatabase.getMapProfile();

	public List<Profile> getProfiles() {
		List<Profile> message = new ArrayList<Profile>();
		message.addAll(map.values());
		return message;
	}

	public Profile getProfile(String name) {
		return map.get(name);
	}

	public void addProfile(Profile m) {
		map.put(m.getName(), m);
	}

	public void updateProfile(Profile m) {
		map.put(m.getName(), m);
	}

	public void removeProfile(String name) {
		map.remove(name);
	}

}

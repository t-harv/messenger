package org.tutorial.rest.messenger.dao;

import java.util.HashMap;
import java.util.Map;

import org.tutorial.rest.messenger.model.Message;
import org.tutorial.rest.messenger.model.Profile;


public class DatabaseClass {

	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();

	
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	
	public static Map<String, Profile> getProfiles() {
		return profiles;
	}

	
	
	
}

package org.tutorial.rest.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.tutorial.rest.messenger.dao.DatabaseClass;
import org.tutorial.rest.messenger.model.Profile;

public class ProfileService {
	
	private Map<String, Profile> profiles = DatabaseClass.getProfiles();
	
	public ProfileService(){
		profiles.put("toyanLand", new Profile(1, "toyanLand", "Toyan", "Harvey"));
		profiles.put("joyceLand", new Profile(2, "joyceLand", "Joyce", "Harvey"));
		
	}

	public List<Profile> getAllProfiles() {
		return new ArrayList<Profile>(profiles.values()); 
	}

	public Profile getProfile(String profileName) {
		return profiles.get(profileName);
	}

	public Profile addProfile(Profile profile) {
		profile.setId(profiles.size() + 1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}

	public Profile updateProfile(Profile profile) {
		if (profile.getProfileName().isEmpty()) {
			return null;
		}
		return profiles.put(profile.getProfileName(), profile);
	}

	public Profile removeProfile(String profileName) {
		return profiles.remove(profileName);
	}

}

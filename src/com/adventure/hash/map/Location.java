package com.adventure.hash.map;
/**
 * 
 */
/**
 * @author Kishan : Created for a Simple Adventure Game
 *
 */

import java.util.HashMap;
import java.util.Map;

public class Location {
	
	private final int locationID;
	private final String description;
	private Map<String, Integer> exits; 
	
	
	public Location(int locationID, String description) {
		super();
		this.locationID = locationID;
		this.description = description;
		exits = new HashMap<>();
		exits.put("Q", 0);
	}
	
	
	public void addExit(String direction, Integer location) {
		exits.put(direction, location);
		
	}

	public Map<String, Integer> getExits() {
		return new HashMap<String, Integer>(exits);
	}

	public int getLocationID() {
		return locationID;
	}

	public String getDescription() {
		return description;
	}
}

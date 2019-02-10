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
	//Cannot Change it
	private final int locationID;
	private final String description;
	private final Map<String, Integer> exits; 	
	
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

	// returns a copy not the actual one
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

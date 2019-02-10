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
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Intialize Location Class as a Map
		Map<Integer, Location> locations = new HashMap<>();

		// Adding the Locations
		locations.put(0, new Location(0, "Location 0"));
		locations.put(1, new Location(1, "Location 1"));
		locations.put(2, new Location(2, "Location 2"));
		locations.put(3, new Location(3, "Location 3"));
		locations.put(4, new Location(4, "Location 4"));
		locations.put(5, new Location(4, "Location 5"));

		// Added Exit for Point 1
		locations.get(1).addExit("S", 2);
		locations.get(1).addExit("W", 4);
		locations.get(1).addExit("E", 5);
		locations.get(1).addExit("N", 3);

		// Added Exit for Point 2
		locations.get(2).addExit("W", 4);

		// Added Exit for Point 3
		locations.get(3).addExit("E", 5);

		// Added Exit for Point 4
		locations.get(4).addExit("N", 3);

		// Added Exit for Point 5
		locations.get(5).addExit("S", 2);

		// Ask the User Where she/he is
		Scanner ask = new Scanner(System.in);
		System.err.println("Please tell me your location \n");
		int loc = ask.nextInt();

		// Loop it they say I am tired and I dont want to play the game
		while (true) {
			if (locations.containsKey(loc) && loc != 0) {
				System.out.println("Valid Location Found " + loc);

				// Get All Exits For the Location
				Map<String, Integer> exits = locations.get(loc).getExits();
				System.out.println("Available Exit ");
				for (String exit : exits.keySet()) {
					System.out.print(exit + ", ");
				}
				System.out.println();
				System.out.println("Which direction you want to go");
				String direction = ask.next();
				if (exits.containsKey(direction)) {
					// Take our new location
					loc = exits.get(direction);
				} else {
					System.out.println("Invalid Direction \n");
					System.err.println("Please tell me your location Again \n");
					loc = ask.nextInt();
				}

			} else {
				System.out.println("Invalid Location or You want to Exit the Game");
				break;
			}
		}

	}

}

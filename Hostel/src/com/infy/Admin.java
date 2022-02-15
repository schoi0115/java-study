package com.infy;

public class Admin extends Room {
	public void assignRoom(Room rooms[], Member member) {
		for (int i = 0; i < rooms.length; i++) {

			int capacity = rooms[i].getCapacity();
			System.out.println(capacity);
			if (capacity >= 1) {

				member.setRoom(rooms[i]);
				
				capacity--;
				
				rooms[i].setCapacity(capacity);
				
				break;
			}
			
		}

	}

}

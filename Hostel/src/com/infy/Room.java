package com.infy;

public class Room {

	private int roomNo;
	private int capacity;
	private static int roomCounter;
	
	static {
		roomCounter = 500;
	}

	public Room() {
		capacity = 4;
		roomNo = roomCounter++;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public static int getRoomCounter() {
		return roomCounter;
	}
	public static void setRoomCounter(int roomCounter) {
		Room.roomCounter = roomCounter;
	}
}

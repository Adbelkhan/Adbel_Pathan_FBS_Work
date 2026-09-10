package model.home;

import java.util.ArrayList;
import java.util.List;

import model.rooms.Room;

public class Home {

	private List<Room> rooms = new ArrayList<>();
	
	//Add room 
	public void addRoom(Room room)
	{
		if(room != null)
		{
			rooms.add(room);
		}
	}
	
	
	//Get all room
	public List<Room> getRoom()
	{
		return rooms;
	}
	
	//Get room by name 
	
	public Room getRoom(String roomName)
	{
		for (Room room : rooms)
		{
			if(room !=null && 
				room.getRoomName().equalsIgnoreCase(roomName))
			{
				return room; // room found 
			}
		}
		return null;  // room not found 
	}
	
	
	// Turn ON a device in a particular room  
	
	public void turnOn(String roomName , String deviceName)
	{
		Room room = getRoom(roomName);
		
		if(room !=null)
		{
			room.turnOnDevice(deviceName);
		}
		else
		{
			System.out.println("Room" + roomName + "not found");
		}
	}
	
	// turn OFF device in a particular
	
	public void turnOff(String roomName, String deviceName)
	{
		Room room = getRoom(roomName);
		
		if(room != null)
		{
			room.turnOffDevice(deviceName);
		}
		else
		{
			System.out.println("Room" + roomName + "not found");
		}
	}
	
	//show status of all devices in all rooms 
	
	public void showAllStatus()
	{
		for(Room room : rooms)
		{
			room.showStatus();
		}
	}
	
	
}

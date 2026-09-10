package DAO;

import java.util.List;

import model.devices.Device;
import model.home.Home;
import model.rooms.Room;

public class HomeDAO 
{
	private Home home;
	
	public HomeDAO()
	{
		home = new Home();
	}

	// add room 
	public boolean addRoom(Room room)
	{
		if(room == null)
		{
			return false;
		}
		
		home.addRoom(room);
		return true;
		
	}
	
	// get all room 
	public List<Room> getAllRooms()
	{
		return home.getRoom();
	}
	
	
	// find room by name 
	public Room getRoomByName(String roomName)
	{
		return home.getRoom(roomName);
		
	}
	
	//add device to room 
	public boolean addDevice(int roomId, Device device)
	{
		for(Room room : home.getRoom())
		{
			if(room.getRoomId() == roomId)
			{
				if(device == null)
				{
					return false;
				}
				
				if(!room.isDeviceAllowed(device))
				{
					return false;
				}
				
				room.addDevice(device);
				return true;
			}
		}
		
		return false;
	}
	
	//find room by id 
	public Room getRoomById(int roomId)
	{
		for(Room room : home.getRoom())
		{
			if(room.getRoomId() == roomId)
			{
				return room;
			}
		}
		return null;
	}
	
	
	// remove device 
	public boolean removeDevice(int roomId , String deviceName)
	{
		Room room = getRoomById(roomId);
		
		if(room !=null)
		{
			return room.removeDevice(deviceName);
		}
		return false;
	}

	//turn on device
	public boolean turnOnDevice(int roomId , String deviceName)
	{
		Room room = getRoomById(roomId);
		
		if(room != null)
		{
			return room.turnOnDevice(deviceName);
		}
		
		return false;
	}
	
	//turn off device 
	
	public boolean turnOffDevice(int roomId, String deviceName)
	{
		Room room = getRoomById(roomId);
		
		if(room != null)
		{
			return room.turnOffDevice(deviceName);
		}
		
		return false;
	}
	
	// show status of all device 
	
	public void showAllStatus()
	{
		home.showAllStatus();
	}

}

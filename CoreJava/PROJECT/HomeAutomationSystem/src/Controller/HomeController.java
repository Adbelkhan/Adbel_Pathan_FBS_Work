package Controller;

import java.util.List;

import DAO.HomeDAO;
import model.devices.Device;
import model.rooms.Room;

public class HomeController 
{
	private HomeDAO homeDAO;

	// constructor 
	public HomeController(HomeDAO homeDAO) {
		super();
		this.homeDAO = homeDAO;
	}
	
	// add room 
	public boolean addRoom(Room room)
	{
		return homeDAO.addRoom(room);
	}
	
	// add devices 
	public boolean addDevice(int roomId , Device device)
	{
		return homeDAO.addDevice(roomId, device);
	}

	// remove devices
	public boolean removeDevice(int roomId , String deviceName)
	{
		return homeDAO.removeDevice(roomId, deviceName);
	}
	
	// turn on device 
	public boolean turnOnDevice(int roomId , String deviceName)
	{
		return homeDAO.turnOnDevice(roomId, deviceName);
	}
	
	// turn off device
	public boolean turnOffDevice(int roomId , String deviceName)
	{
		return homeDAO.turnOffDevice(roomId, deviceName);
	}
	
	// find room by room name 
	public Room getRoomByName(String roomName)
	{
		return homeDAO.getRoomByName(roomName);
	}
	
	// find room by id 
	public Room getRoomById(int roomId)
	{
		return homeDAO.getRoomById(roomId);
	}
	
	// find the list of all rooms 
	public List<Room> getAllRooms()
	{
		return homeDAO.getAllRooms();
	}
	
	// show  status of all device  
	public void showAllStatus()
	{
		homeDAO.showAllStatus();
	}
}

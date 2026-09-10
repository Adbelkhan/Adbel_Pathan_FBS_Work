package model.rooms;

import java.util.ArrayList;

import java.util.List;
import model.devices.Device;



public abstract class Room {

    private int roomId;
    private String roomName;
    private List<Device> devices;

    // Constructors
    public Room(int roomId, String roomName) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.devices = new ArrayList<>();
    }

    public Room() {
        this.devices = new ArrayList<>();
    }

    // Getters and Setters
    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
    	
    	if(devices !=null)
    	{
    		this.devices = devices;
    	}
        
    }

 // Check whether a particular device is allowed in this room
    public abstract boolean isDeviceAllowed(Device device);
    
    
    //get device by name 
    public Device getDeviceByName(String deviceName)
    {
		for(Device device : devices)
		{
			if(device.getDeviceName().equalsIgnoreCase(deviceName))
			{
				return device;
			}
		}
		
		return null;
    	
    }
    
    
    // add device 
    
    public void addDevice(Device device)
    {
    	if(device == null)
    	{
    		return;
    	}
    	
    	if(!isDeviceAllowed(device))
    	{
    		System.out.println(device.getDeviceType() + " is not allowed in " + roomName);
    		
    		return;
    	}
    	
    
    
        if(!devices.contains(device))
        {
    	  devices.add(device);
    	
    	  System.out.println(device.getDeviceType() + " added to " +  roomName);
    	
        }
    
    }
    //remove device 
    
    public boolean removeDevice(String deviceName)
    {
    	Device device = getDeviceByName(deviceName);
    	
    	if(device != null)
    	{
    		devices.remove(device);
    		
    		System.out.println(device.getDeviceType() + "remove from" + roomName);
    		
    		return true;
    	}
    	
    	System.out.println("Device" + deviceName + "not found in " + roomName);
    	
    	return false;
    }
    
    
    
    //turn on device 
    public boolean turnOnDevice(String deviceName)
    {
    	Device device = getDeviceByName(deviceName);
    	
    	if(device !=null)
    	{
    		device.turnOn();
    		return true;
    	}
    	
    	System.out.println("Device" + deviceName + "not found in" + roomName);
    	
    	return false;
    }
 
    
 
   //turn off device 
    
    public boolean turnOffDevice(String deviceName)
    {
    	Device device = getDeviceByName(deviceName);
    	
    	if(device !=null)
    	{
    		device.turnOff();
    		return true;
    	}
    	
    	System.out.println("Device"+ deviceName + "Not found in" + roomName);
    	
    	return false;
    }
    
    
 
    

    public void showStatus()
    {
    	System.out.println("Room:" +  roomName);
    	
    	if(devices.isEmpty())
    	{
    		System.out.println("No devices in this room.");
    		return;
    	}
    	
    	for(Device  device: devices)
    	{
    		if(device.getPowerStatus())
    		{
    			System.out.println(device.getDeviceName() + " : ON");
    		}
    		else
    		{
    			System.out.println(device.getDeviceName() + " : OFF");
    		}
    	}
    }
 
    
}


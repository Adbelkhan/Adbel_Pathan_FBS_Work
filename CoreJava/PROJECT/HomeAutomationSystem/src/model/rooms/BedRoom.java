package model.rooms;

import model.devices.Device;
import model.interfaces.AllowedInBedroom;

public class BedRoom extends Room{

	public BedRoom(int roomId, String roomName) {
        super(roomId, roomName); 
    }

	@Override
	public boolean isDeviceAllowed(Device device) {
		return device instanceof AllowedInBedroom;
	}	
}

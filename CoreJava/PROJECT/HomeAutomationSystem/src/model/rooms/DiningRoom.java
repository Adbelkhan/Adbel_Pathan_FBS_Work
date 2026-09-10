package model.rooms;

import model.devices.Device;
import model.interfaces.AllowedInDiningroom;

public class DiningRoom extends Room{

	public DiningRoom(int roomId, String roomName) {
		super(roomId, roomName);
	}

	@Override
	public boolean isDeviceAllowed(Device device) {
		return device instanceof AllowedInDiningroom;
	}

	
}


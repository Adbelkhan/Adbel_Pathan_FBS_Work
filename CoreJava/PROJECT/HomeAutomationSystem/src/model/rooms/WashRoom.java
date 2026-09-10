package model.rooms;

import model.devices.Device;
import model.interfaces.AllowedInWashroom;

public class WashRoom extends Room {

	public WashRoom(int roomId, String roomName) {
		super(roomId, roomName);
	}

	@Override
	public boolean isDeviceAllowed(Device device) {
		return device instanceof AllowedInWashroom;
	}

	
}

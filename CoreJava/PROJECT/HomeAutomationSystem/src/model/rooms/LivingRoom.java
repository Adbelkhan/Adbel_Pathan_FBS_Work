package model.rooms;

import model.devices.Device;
import model.interfaces.AllowedInLivingroom;

public class LivingRoom extends Room {

	public LivingRoom(int roomId, String roomName) {
		super(roomId, roomName);
	}

	@Override
	public boolean isDeviceAllowed(Device device) {
		return device instanceof AllowedInLivingroom;
	}

	
	
}

package model.rooms;

import model.devices.Device;
import model.interfaces.AllowedInKitchen;

public class Kitchen extends Room {

	public Kitchen(int roomId, String roomName) {
		super(roomId, roomName);
	}

	@Override
	public boolean isDeviceAllowed(Device device) {
		return device instanceof AllowedInKitchen;
	}

	
}

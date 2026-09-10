package model.rooms;

import model.devices.Device;
import model.interfaces.AllowedInCorridor;

public class Corridor extends Room {

    public Corridor(int roomId, String roomName) {
        super(roomId, roomName);
    }

    @Override
    public boolean isDeviceAllowed(Device device) {
        return device instanceof AllowedInCorridor;
    }
}

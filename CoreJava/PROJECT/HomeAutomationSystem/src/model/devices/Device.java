package model.devices;

import model.interfaces.PowerControl;

public abstract class Device implements PowerControl {

   private  int deviceId;
   private  String deviceName;
   private  boolean isOn; 

    public Device(int deviceId, String deviceName) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.isOn = false; 
    }

    
    public abstract String getDeviceType();

    
    public void turnOn() {
        isOn = true;
        System.out.println(deviceName + " is turned ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(deviceName + " is turned OFF");
    }

    public boolean getPowerStatus() {
        return isOn;
    }

 
    public int getDeviceId() {
        return deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }
}

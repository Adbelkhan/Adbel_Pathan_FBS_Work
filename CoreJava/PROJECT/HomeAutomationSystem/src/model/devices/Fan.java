package model.devices;



import model.interfaces.AllowedInBedroom;
import model.interfaces.AllowedInDiningroom;
import model.interfaces.AllowedInKitchen;
import model.interfaces.AllowedInLivingroom;

import model.interfaces.SpeedControllable;

public class Fan extends Device implements SpeedControllable, AllowedInBedroom, AllowedInLivingroom, AllowedInDiningroom, AllowedInKitchen
{
	private int speed;

	public Fan(int deviceId) {
		super(deviceId, "Fan");
		this.speed =1;
		
	}

	@Override
	public String getDeviceType() {
		
		return "Fan";
	}

	@Override
	public void increaseSpeed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decreaseSpeed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getCurrentSpeed() {
		return speed;
		
	}

	
	
   
}

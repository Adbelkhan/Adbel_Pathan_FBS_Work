package model.devices;


import model.interfaces.AllowedInWashroom;

import model.interfaces.SpeedControllable;
import model.interfaces.TimerControllable;

public class WashingMachine extends Device implements  SpeedControllable, TimerControllable , AllowedInWashroom {
	
	private int speed;
	private int remainingTime;
	

    public WashingMachine(int deviceId) {
        super(deviceId, "Washing Machine");
        this.speed=1;
        this.remainingTime=0;
       
    }

	@Override
	public String getDeviceType() {
	
		return "WashingMachine";
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
	public int  getCurrentSpeed() {
		return speed;
		
	}

	@Override
	public void setTimer(int minutes) {
		
		if(minutes < 0 )
		{
			System.out.println("Timer cannot be negative ");
			return;
		}
		
		remainingTime = minutes;
		System.out.println("Washing Machine timer set to " + remainingTime + "minutes");
	}

	@Override
	public int getRemainingTime() {
		
		return remainingTime;
	}
    
}

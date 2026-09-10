package model.devices;


import model.interfaces.AllowedInKitchen;

import model.interfaces.TemperatureControlDevice;
import model.interfaces.TimerControllable;

public class Oven extends Device implements  TemperatureControlDevice , TimerControllable , AllowedInKitchen{
	
	
	private int currentTemperature;
	private int remaningTime;
    
    public Oven(int deviceId) {
    	super(deviceId , "Oven");
    	
    	this.currentTemperature=180;
    	this.remaningTime =0;
    	
    }

    @Override
	public String getDeviceType() {
		
		return "Oven";
	}

    

	@Override
	public void increaseTemperature() {
		
		if(currentTemperature < 500)
		{
			currentTemperature++;
			
			System.out.println("Oven temperature increased to " + currentTemperature);
		}
		
		
	}

	@Override
	public void decreaseTemperature() {
		
		if(currentTemperature > 0)
		{
			currentTemperature--;
			
			System.out.println("Oven temperature decreased to " + currentTemperature);
		}
		
	}

	@Override
	public void setTemperature() {
		
		System.out.println("Current Oven Temperature is " + currentTemperature);
		
	}

	@Override
	public int getCurrentTemperature() {
		
		return currentTemperature;
	}

	@Override
	public void setTimer(int minutes) {
		
		if(minutes <0)
		{
			System.out.println("Timer cannot be negative");
			return;
		}
		
		remaningTime = minutes;
		
		System.out.println("Oven timer set to " + remaningTime+ "minutes" );
	}

	@Override
	public int getRemainingTime() {
		
		return remaningTime;
	}
    
	 
}

package model.devices;


import model.interfaces.AllowedInBedroom;
import model.interfaces.AllowedInCorridor;
import model.interfaces.AllowedInDiningroom;
import model.interfaces.AllowedInKitchen;
import model.interfaces.AllowedInLivingroom;
import model.interfaces.AllowedInWashroom;
import model.interfaces.BrightnessControl;


public class Light extends Device implements BrightnessControl, 
                                             AllowedInBedroom, 
                                             AllowedInLivingroom, 
                                             AllowedInDiningroom, 
                                             AllowedInCorridor,
                                             AllowedInKitchen,
                                             AllowedInWashroom
                                             
                                             {

	private int brightnessLevel;
	
	public Light(int deviceId)
	{
		super(deviceId, "Light");
		this.brightnessLevel=50;
	}

	@Override
	public String getDeviceType() {
		
		return "Light";
	}

	@Override
	public void increaseBrightness() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decreaseBrightness() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getBrightnessLevel() {
		
		return brightnessLevel;
	}

	

	
	
}

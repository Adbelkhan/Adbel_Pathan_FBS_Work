package model.devices;



import model.interfaces.AllowedInBedroom;
import model.interfaces.AllowedInLivingroom;
import model.interfaces.SpeedControllable;
import model.interfaces.TemperatureControlDevice;

public class AC extends Device implements SpeedControllable, TemperatureControlDevice, AllowedInBedroom, AllowedInLivingroom {

    private int currentTemperature;
    private int speed;

    public AC(int deviceId) {
        super(deviceId, "AC");
        this.currentTemperature=24;
        this.speed=1;
        
    }

    @Override
    public String getDeviceType() {
        return "AC";
    }

	

	@Override
	public void increaseTemperature() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decreaseTemperature() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTemperature() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getCurrentTemperature() {
		
		return currentTemperature;
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

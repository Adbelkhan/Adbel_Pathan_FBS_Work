package model.devices;


import model.interfaces.AllowedInBedroom;
import model.interfaces.EntertainmentControl;


public class TV extends Device implements  EntertainmentControl , AllowedInBedroom{

	private int volume;
	
	public TV(int deviceId) {
		super(deviceId, "TV");
		this.volume = 10;
	}

	@Override
	public String getDeviceType() {
		
		return "TV";
	}

	

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void next() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void previous() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVolume(int level) {
		
		if(level < 0 || level > 100)
		{
			System.out.println("Volume must be between 0 and 100");
			return;
		}
		
		volume =level;
		
		System.out.println("TV volume set to "+ volume);
	}

	@Override
	public int getCurrentVolume() {
		
		return volume ;
	}
	
	
	
	
}

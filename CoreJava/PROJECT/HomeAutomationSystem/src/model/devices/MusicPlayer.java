package model.devices;


import model.interfaces.AllowedInBedroom;
import model.interfaces.AllowedInLivingroom;
import model.interfaces.EntertainmentControl;



public class MusicPlayer extends Device implements EntertainmentControl , AllowedInBedroom, AllowedInLivingroom {


	private int volume;
	private String currentTrack;
    
    public MusicPlayer(int deviceId) {
        super(deviceId, "Music Player");
        
        this.volume=10;
        this.currentTrack="No Track";
        
    }

    @Override
    public String getDeviceType() {
        return "Music Player";
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
		
		volume = level;
		
		System.out.println("Music Player set to "+volume);
		
	}

	@Override
	public int getCurrentVolume() {
		
		return volume;
	}

	

    
}


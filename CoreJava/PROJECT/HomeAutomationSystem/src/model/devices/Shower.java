package model.devices;


import model.interfaces.AllowedInWashroom;
import model.interfaces.FlowControllable;



public class Shower extends Device implements  FlowControllable , AllowedInWashroom {

	private int flowLevel;

    public Shower(int deviceId) {
        super(deviceId, "Shower");
        this.flowLevel=1;
            
    }

    @Override
    public String getDeviceType() {
        return "Shower";
    }

	@Override
	public void increaseFlowLevel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decreaseFlowLevel() {
		// TODO Auto-generated method stub
		
	}

    
    

	

   
    
}

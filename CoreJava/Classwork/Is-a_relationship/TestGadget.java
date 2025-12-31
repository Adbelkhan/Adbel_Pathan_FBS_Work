class Gadget
{
	String brand;
	String model;
	int batteryLife;
	
	int calBattery()
    {
        return batteryLife;
    }

    Gadget()
    {
        this.brand = "ubgc";
        this.model = "ybjv";
        this.batteryLife = 00;
    }

	Gadget(String brand, String model, int batteryLife) 
	{
		this.brand = brand;
		this.model = model;
		this.batteryLife = batteryLife;
	}

	String getBrand()
	{
		return brand;
	}

	void setBrand(String brand) 
	{
		this.brand = brand;
	}

	String getModel() 
	{
		return model;
	}

	void setModel(String model) 
	{
		this.model = model;
	}

	int getBatteryLife() 
	{
		return batteryLife;
	}

	void setBatteryLife(int batteryLife) 
	{
		this.batteryLife = batteryLife;
	}
	
	void display()
	{
		System.out.println();
		System.out.println("Brand       : "+this.brand);
		System.out.println("Model       : "+this.model);
		System.out.println("BatteryLife : "+this.batteryLife);
	}
      
}// class gadget ends here 

class SmartWatch extends Gadget
{
	int stepCount;
	int heartRate;
	
	int calBattery()
    {
        return batteryLife - 2;
    } 
	
	SmartWatch()
    {
        super();
        this.stepCount = 1000;
        this.heartRate = 72;
    }

    SmartWatch(String brand, String model, int batteryLife, int stepCount, int heartRate)
    {
        super(brand, model, batteryLife);
        this.stepCount = stepCount;
        this.heartRate = heartRate;
    }

	int getStepCount() 
	{
		return stepCount;
	}

	void setStepCount(int stepCount)
	{
		this.stepCount = stepCount;
	}

	int getHeartRate()
	{
		return heartRate;
	}

	void setHeartRate(int heartRate)
	{
		this.heartRate = heartRate;
	}
	
	void display()
	{
		System.out.println();
		System.out.println("SmartWatch Details ");
		super.display();
		System.out.println("Model       : "+this.stepCount);
		System.out.println("BatteryLife : "+this.heartRate);
	}
    
}// class SmartWatch ends here 

class Tablet extends Gadget
{
	double displaySize;
	
	int calBattery()
    {
        return batteryLife - 3;
    }
	
	Tablet()
    {
        super();
        this.displaySize = 10.5;
    }

    Tablet(String brand, String model, int batteryLife, double displaySize)
    {
        super(brand, model, batteryLife);
        this.displaySize = displaySize;
    }

	double getDisplaySize() 
	{
		return displaySize;
	}

	void setDisplaySize(double displaySize) 
	{
		this.displaySize = displaySize;
	}
    
	void display()
	{
		System.out.println();
		System.out.println("Tablet  Details ");
		super.display();
		System.out.println("BatteryLife : "+this.displaySize);
	}
    
}// class Tablet ends here

class Camera extends Gadget
{
	int pixels;
	int zoom;
	
	 int calBattery()
	 {
	     return batteryLife - 4;
	 }
	 
	 Camera()
	 {
		 super();
		 this.pixels=00;
		 this.zoom=00;
	 }

	 Camera(String brand, String model, int batteryLife,int pixels, int zoom) 
	 {
		super(brand, model, batteryLife);
		this.pixels = pixels;
		this.zoom = zoom;
	 }

	 int getPixels() 
	 {
		 return pixels;
	 }

	 void setPixels(int pixels) 
	 {
		 this.pixels = pixels;
	 }

	 int getZoom()
	 {
		 return zoom;
	 }

	 void setZoom(int zoom)
     {
		 this.zoom = zoom;
	 }
	 
	 void display()
		{
			System.out.println();
			System.out.println("Camera  Details ");
			super.display();
			System.out.println("Pixels : "+this.pixels);
			System.out.println("Zoom   :"+this.zoom);
		}
	 
}// class Camera ends here 
class TestGadget 
{

	public static void main(String[] args) 
	{
		Gadget g1 = new Gadget("Sony","G110",20);
		System.out.println(g1);
		
		SmartWatch s1 = new SmartWatch("Apple", "Watch 9", 18, 3000, 75);
        System.out.println("\n" + s1);

        Tablet t1 = new Tablet("Samsung", "Tab S8", 25, 11.0);
        System.out.println("\n" + t1);

        Camera c1 = new Camera("Canon", "EOS", 15, 64, 30);
        System.out.println("\n" + c1);

	}

}

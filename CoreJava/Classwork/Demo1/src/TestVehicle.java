class Vehicle
{
	String BrandName;
	String ModelName;
	double price;
	
	Vehicle()
	{
	      this.BrandName="sjbu";
	      this.ModelName="qwe";
	      this.price=0000;

	}
	Vehicle(String BrandName, String ModelName, double price) {
	
		this.BrandName = BrandName;
		this.ModelName = ModelName;
		this.price = price;
	}
	
	void display()
	   {
		 //System.out.println("Vehicle Details");
		 System.out.println();
	     System.out.println("BrandName :" + this.BrandName);
	     System.out.println("ModelName :" + this.ModelName);
	     System.out.println("Price :" + this.price);
	     //System.out.println();
	   }
	String getBrandName() 
	{
		return BrandName;
	}
	
	void setBrandName(String brandName)
	{
		BrandName = brandName;
	}
	
	String getModelName() 
	{
		return ModelName;
	}
	
	void setModelName(String modelName)
	{
		ModelName = modelName;
	}
	
	double getPrice() 
	{
		return price;
	}
	
	void setPrice(double price) 
	{
		this.price = price;
	}
	
	
	
}//class Vehicle ends here

class Car extends Vehicle
{
	int SeatBelt;
	
	Car()
	{
		super();
	     this.SeatBelt=0;
	}

	Car(String BrandName, String ModelName ,double price, int seatBelt) 
	{
		super(BrandName,ModelName,price);//parameter initialization list
		SeatBelt = seatBelt;
	}

	int getSeatBelt()
	{
		return SeatBelt;
	}

	void setSeatBelt(int seatBelt) 
	{
		SeatBelt = seatBelt;
	}
	
	void display()
	{
		System.out.println();
		System.out.println("CAR DETAILS");
		//System.out.println();
		super.display();
		System.out.println("SeatBelt :" +this.SeatBelt);
		System.out.println();
		
	}	
}//class car ends here


class Bike extends Vehicle
{
	int helmet;
	int stand;
	
	Bike()
	{
		super();
		this.helmet=0;
		this.stand=0;
	}

	Bike(String BrandName, String ModelName ,double price, int helmet, int stand) 
	{
		super(BrandName,ModelName,price);//parameter initialization list
		this.helmet = helmet;
		this.stand = stand;
	}

	int getHelmet() 
	{
		return helmet;
	}

	void setHelmet(int helmet)
	{
		this.helmet = helmet;
	}

	int getStand()
	{
		return stand;
	}

	void setStand(int stand)
	{
		this.stand = stand;
	}
	void display()
	{
		System.out.println();
		System.out.println("BIKE DETAILS");
		//System.out.println();
		super.display();
		System.out.println("Helmet :" +this.helmet);
		System.out.println("Stand :"+this.stand);
		System.out.println();
		
	}		
}// class Bike ends here 

class Bus extends Vehicle
{
	int EmergenyExit;
	
	Bus()
	{
		super();
		this.EmergenyExit=0;
	}

	Bus(String BrandName, String ModelName ,double price,int emergenyExit) 
	{
		super(BrandName, ModelName, price);//parameter initialization list
		EmergenyExit = emergenyExit;
	}

	int getEmergenyExit() 
	{
		return EmergenyExit;
	}

	void setEmergenyExit(int emergenyExit) 
	{
		EmergenyExit = emergenyExit;
	}
	
	void display()
	{
		System.out.println();
		System.out.println("BUS DETAILS");
		//System.out.println();
		super.display();
		System.out.println("EmergencyExit :" +this.EmergenyExit);
		System.out.println();
		
	}		
}//class Bus ends here


class TestVehicle {

	public static void main(String[] args)
	{
		Vehicle v1= new Vehicle("BMW","BMW M3",8000000);
		v1.display();
		Vehicle v2= new Vehicle();
		v2.display();
		
		Car c1= new Car("Land Rover","Range Rover Velar",7000000,4);
		c1.display();
		Car c2= new Car();
		c2.display();
		
		
		Bike b1= new Bike("Royal Enfield","Himalayan 450",300000,2,2);
		b1.display();
		Bike b2= new Bike();
		b2.display();
		
		Bus d1 = new Bus("Tata Motors","Tata Starbus City",2800000,1);
		d1.display();
		Bus d2 = new Bus();
        d2.display();		
	    
		
	}

}//class TestVehicle Ends here

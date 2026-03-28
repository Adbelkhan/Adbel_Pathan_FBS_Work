class Vehicle
{
	String BrandName;
	String ModelName;
	double price;
	
	double calPrice()
	{
	    return price;
	}

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
	
	public String toString()
	{
		return "\n"+"\nBrandName :"+this.BrandName+"\nModelName"+this.ModelName+"\nPrice"+this.price;
	}
	
}//class Vehicle ends here

class Car extends Vehicle
{
	int SeatBelt;
	
	double calPrice()
	{
	    return price + 50000;   
	}

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
	
	
	public String toString()
	{
		return "\n"+"Car"+"\n"+super.toString()+"\nSeatBelt :"+this.SeatBelt;
	}
	
}//class car ends here


class Bike extends Vehicle
{
	int helmet;
	int stand;
	
	double calPrice()
	{
	    return price + 10000;   
	}

	
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
	
	
	public String toString()
	{
		return "\n"+"Bike"+"\n"+super.toString()+"\nHelmet :"+this.helmet+"\nStand :"+this.stand;
	}
	
}// class Bike ends here 

class Bus extends Vehicle
{
	int EmergenyExit;
	double calPrice()
	{
	    return price + 80000;   
	}

	
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
	
		
	
	public String toString()
	{
		return "\n"+"Bus"+"\n"+super.toString()+"\nEmergencyExit :"+this.EmergenyExit;
	}
	
}//class Bus ends here

class TestVehicle
{
	public static void main(String[] args)
	{
		Vehicle v1= new Vehicle("BMW","BMW M3",8000000);
		v1.toString();
		System.out.println(v1);
		
		//Vehicle v2= new Vehicle();
		//v2.display();
		
		Car c1= new Car("Land Rover","Range Rover Velar",7000000,4);
		c1.toString();
		System.out.println(c1);
		
		//Car c2= new Car();
		//c2.display();
		
		
		Bike b1= new Bike("Royal Enfield","Himalayan 450",300000,2,2);
		b1.toString();
		System.out.println(b1);
		
		//Bike b2= new Bike();
		//b2.display();
		
		Bus d1 = new Bus("Tata Motors","Tata Starbus City",2800000,1);
		d1.toString();
		System.out.println(d1);
		
		//Bus d2 = new Bus();
        //d2.display();			
	}
	
}//class TestVehicle Ends here


/*
 * class MyVehicle {
 * 
 * public static void main(String[] args) {
 * 
 * Vehicle v; // generic reference
 * 
 * v = new Vehicle("Audi", "Audi A6", 6500000); v.toString();
 * System.out.println(v);
 * 
 * System.out.println(v.calPrice());
 * 
 * v = new Car("Hyundai", "Creta", 1800000, 4); v.toString();
 * System.out.println(v);
 * 
 * System.out.println(v.calPrice());
 * 
 * v = new Bike("Honda", "CBR 650R", 900000, 1, 1); v.toString();
 * System.out.println(v);
 * 
 * System.out.println(v.calPrice());
 * 
 * v = new Bus("Volvo", "Volvo 9400", 7500000, 2); v.toString();
 * System.out.println(v);
 * 
 * System.out.println(v.calPrice()); }
 * 
 * }
 */

class TestVehicleD {

	public static void main(String[] args)
	{
		TestVehicleD.updateVehicle(new Car("Land Rover","Range Rover Velar",7000000,4));
		TestVehicleD.updateVehicle(new Bike("Royal Enfield","Himalayan 450",300000,2,2));

	}

     static void updateVehicle(Vehicle v1) 
     {
		if(v1 instanceof Car)
		{
			Car c1 = (Car) v1;
			c1.setPrice(8000000);
			System.out.println(c1);
		}
		
		if(v1 instanceof Bike)
		{
			Bike b1 = (Bike) v1;
			b1.setPrice(250000);
			System.out.println(b1);
		}
	 }

}

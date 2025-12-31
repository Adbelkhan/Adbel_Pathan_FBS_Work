class Animal
{
	int age;
	String color;
	double weight;
	
	Animal()
	{
		this.age = 00;
		this.color = "jciec";
		this.weight =4984;
	}

	Animal(int age, String color, double weight) 
	{
		this.age = age;
		this.color = color;
		this.weight = weight;
	}

	int getAge() 
	{
		return age;
	}

	void setAge(int age)
	{
		this.age = age;
	}

	String getColor() 
	{
		return color;
	}

	void setColor(String color) 
	{
		this.color = color;
	}

	double getWeight() 
	{
		return weight;
	}

	void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	void display()
	{
		System.out.println();
		System.out.println("Age        :"+this.age);
		System.out.println("Color      :"+this.color);
		System.out.println("Weight     :"+this.weight);
		
	}	
}// class Animal ends here

class Dog extends Animal
{
	String bark;
	
	Dog()
	{
		super();
		this.bark = "Not";
	}

	Dog(int age, String color, double weight, String bark) 
	{
		super( age, color, weight);//parameter initialization list
		this.bark = bark;
	}

	String getBark() 
	{
		return bark;
	}

	void setBark(String bark) 
	{
		this.bark = bark;
	}
	
	void display()
	{
		System.out.println();
		System.out.println("DOG DETAILS");
		super.display();
		System.out.println("Bark       :"+this.bark);
		
	}	
		
}//class Dog ende here 

class Cat extends Animal
{
	String whiskers;
	String claws;
	
	Cat()
	{
		super();
		this.whiskers = "no";
		this.claws = "not";
	}

	Cat(int age, String color, double weight,String whiskers, String claws)
	{
		super(age, color, weight);//parameter initialization list
		this.whiskers = whiskers;
		this.claws = claws;
	}

	String getWhiskers() 
	{
		return whiskers;
	}

	void setWhiskers(String whiskers) 
	{
		this.whiskers = whiskers;
	}

	String getClaws()
	{
		return claws;
	}

	void setClaws(String claws) 
	{
		this.claws = claws;
	}
	
	void display()
	{
		System.out.println();
		System.out.println("CAT DETAILS");
		super.display();
		System.out.println("Whiskers   :"+this.whiskers);
		System.out.println("Claws      :"+this.claws);
		
	}		
}// class Cat ends here 

class Horse extends Animal 
{
	double speed;
	double stamina;
	double height;
	
	Horse()
	{
		super();
		this.speed = 00;
		this.stamina =00;
		this.height = 00;
	}

	Horse(int age, String color, double weight,double speed, double stamina, double height) {
		super(age, color, weight);//parameter initialization list
		this.speed = speed;
		this.stamina = stamina;
		this.height = height;
	}

	double getSpeed() 
	{
		return speed;
	}

	void setSpeed(double speed)
	{
		this.speed = speed;
	}

	double getStamina()
	{
		return stamina;
	}

	void setStamina(double stamina) 
	{
		this.stamina = stamina;
	}

	double getHeight() 
	{
		return height;
	}

	void setHeight(double height)
	{
		this.height = height;
	}
	
	void display()
	{
		System.out.println();
		System.out.println("HORSE DETAILS");
		super.display();
		System.out.println("Speed      :"+this.speed);
		System.out.println("Stamina    :"+this.stamina);
		System.out.println("Height     :"+this.height);
		
	}		
}// class Horse ends here

class TestAnimal {

	public static void main(String[] args) 
	{
		Animal a1= new Animal(11,"white",90.10);
		a1.display();
		
		Dog d1 = new Dog(3, "Brown", 20.5, "Loud Bark");
		d1.display();
		
		Cat c1 = new Cat(7,"Grey",14.6,"Yes","Sharp");
		c1.display();
		
		Horse h1 = new Horse(22,"Black",355.10,60.5,80.0,5.8);
        h1.display();
	}
}//class TestAnimal Ends here

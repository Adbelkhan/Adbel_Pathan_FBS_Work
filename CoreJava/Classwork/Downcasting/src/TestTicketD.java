class Ticket
{
	int seatNo;
	String time;
	int price;
	
	int calPrice()
	{
	    return price;
	}

	Ticket()
	{
		this.seatNo=00;
		this.time="00:00";
		this.price=101;
	}

	Ticket(int seatNo, String time, int price)
	{
	
		this.seatNo = seatNo;
		this.time = time;
		this.price = price;
	}

	int getSeatNo() 
	{
		return seatNo;
	}

	void setSeatNo(int seatNo) 
	{
		seatNo = seatNo;
	}

	String getTime() 
	{
		return time;
	}

	void setTime(String time) 
	{
		this.time = time;
	}

	int getPrice() 
	{
		return price;
	}

	void setPrice(int price)
	{
		this.price = price;
	}
	
	
	
	public String toString() 
	{
		return "\n"+"\nSeatNo :"+this.seatNo+"\nTime  :"+this.time+"\nPrice :"+this.price;
	}
	
}//class Ticket ends here

class MovieTicket extends Ticket
{
	String movieName;
	int screen;
	
	int calPrice()
	{
	    return price + 100;  
	}

	MovieTicket()
	{
		super();
		this.movieName="bdub";
		this.screen=0;
	}

	MovieTicket(int seatNo, String time, int price, String movieName, int screen) 
	{
		super(seatNo,time,price);//parameter initialization list
		this.movieName = movieName;
		this.screen = screen;
	}

	String getMoviename() 
	{
		return movieName;
	}

	void setMoviename(String moviename) 
	{
		this.movieName = movieName;
	}

	int getScreen() 
	{
		return screen;
	}

	void setScreen(int screen)
	{
		this.screen = screen;
	}
	
	
	public String toString() 
	{
		return "\n"+"MovieTicket"+"\n"+super.toString()+"\nMovieName :"+this.movieName+"\nScreen :"+this.screen;
	}
	
}// class MovieTicket ends here

class TrainTicket extends Ticket
{
	String coachType;
	String birthType;
	
	int calPrice()
	{
	    return price + 50;    
	}

	
	TrainTicket()
	{
		super();
		this.coachType="yu";
		this.birthType="88";
	}

	TrainTicket(int seatNo, String time, int price,String coachType, String birthType)
	{
		super(seatNo,time,price);//parameter initialization list
		this.coachType = coachType;
		this.birthType = birthType;
	}

	String getCoachType() 
	{
		return coachType;
	}

	void setCoachType(String coachType) 
	{
		this.coachType = coachType;
	}

	String getBirthType() 
	{
		return birthType;
	}

	void setBirthType(String birthType)
	{
		this.birthType = birthType;
	}
	
	
	public String toString() 
	{
		return "\n"+"TrainTicket"+"\n"+super.toString()+"\nCoachType :"+this.coachType+"\nBirthType :"+this.birthType;
	}
	
}// class TrainTicket ends here

class EventTicket extends Ticket 
{
	String performerName;
	
	int calPrice()
	{
	    return price + 200;   
	}

	
	EventTicket()
	{
		super();
		this.performerName="iuub";
	}

	EventTicket(int seatNo, String time, int price,String performerName) 
	{
		super(seatNo,time,price);//parameter initialization list
		this.performerName = performerName;
	}

	String getPerformerName() 
	{
		return performerName;
	}

	void setPerformerName(String performerName)
	{
		this.performerName = performerName;
	}
	
	
	public String toString() 
	{
		return "\n"+"EventTicket"+"\n"+super.toString()+"\nPerformerNmae :"+this.performerName;
	}
	
}// class EventTicket ends here 

class TestTicket 
{

	public static void main(String[] args) 
	{
		Ticket t1 =new Ticket(12,"10:05",200);
		t1.toString();
		System.out.println(t1);
		
		MovieTicket m1= new MovieTicket(056,"09:10 AM",350,"Tiger",2);
		m1.toString();
		System.out.println(m1);
		
		TrainTicket tt1 = new TrainTicket(56,"11:05 PM",210,"3A","Side Upper");
		tt1.toString();
		System.out.println(tt1);
		
		EventTicket e1 = new EventTicket(77,"12:00 PM",1000,"KK");
		e1.toString();
		System.out.println(e1);
		
	}
}

/*
 * class MyTicket {
 * 
 * public static void main(String[] args) { Ticket t; // generic reference
 * 
 * t = new Ticket(10, "08:00 AM", 150); t.toString(); System.out.println(t);
 * System.out.println(t.calPrice());
 * 
 * t = new MovieTicket(20, "10:30 AM", 350, "Jawan", 3); t.toString();
 * System.out.println(t); System.out.println(t.calPrice());
 * 
 * t = new TrainTicket(45, "09:15 PM", 450, "Sleeper", "Upper"); t.toString();
 * System.out.println(t); System.out.println(t.calPrice());
 * 
 * t = new EventTicket(60, "07:00 PM", 1200, "Arijit Singh"); t.toString();
 * System.out.println(t); System.out.println(t.calPrice());
 * 
 * }
 * 
 * }
 */

class TestTicketD 
{

	public static void main(String[] args) 
	{
		TestTicketD.updateTicket(new MovieTicket(20, "10:30 AM", 350, "Jawan", 3));
		TestTicketD.updateTicket(new TrainTicket(45, "09:15 PM", 450, "Sleeper", "Upper"));
      
	}

      static void updateTicket(Ticket t1) 
      {
		if(t1 instanceof MovieTicket)
		{
			MovieTicket m1 = (MovieTicket) t1;
			m1.setScreen(5);
			System.out.println(m1);
		}
		
		if(t1 instanceof TrainTicket)
		{
			TrainTicket tt1 = (TrainTicket) t1;
			tt1.setCoachType("2A");
			System.out.println(tt1);
		}
		
	  }

}

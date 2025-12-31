class Ticket
{
	int seatNo;
	String time;
	int price;
	
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
	
	void display()
	{
	
		System.out.println();
		System.out.println("SeatNo :"+this.seatNo);
		System.out.println("Time   :"+this.time);
		System.out.println("Price  :"+this.price);
	}
	
	
}//class Ticket ends here

class MovieTicket extends Ticket
{
	String movieName;
	int screen;
	
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
	void display()
	{
		System.out.println();
		System.out.println("MOVIE TICKET  DETAILS");
		super.display();
		System.out.println("MovieName :"+this.movieName);
		System.out.println("Screen :"+this.screen);
	}	
}// class MovieTicket ends here

class TrainTicket extends Ticket
{
	String coachType;
	String birthType;
	
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
	
	void display()
	{
		System.out.println();
		System.out.println("TRAIN TICKET  DETAILS");
		super.display();
		System.out.println("CoachType :"+this.coachType);
		System.out.println("BirthType :"+this.birthType);
	}	
	
	
}// class TrainTicket ends here

class EventTicket extends Ticket 
{
	String performerName;
	
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
	
	void display()
	{
		System.out.println();
		System.out.println("EVENT TICKET  DETAILS");
		super.display();
		System.out.println("PerformerNmae :"+this.performerName);
		
	}	
	
	
}// class EventTicket ends here 

class TestTicket 
{

	public static void main(String[] args) 
	{
		Ticket t1 =new Ticket(12,"10:05",200);
		t1.display();
		
		MovieTicket m1= new MovieTicket(056,"09:10 AM",350,"Tiger",2);
		m1.display();
		
		TrainTicket tt1 = new TrainTicket(56,"11:05 PM",210,"3A","Side Upper");
		tt1.display();
		
		EventTicket e1 = new EventTicket(77,"12:00 PM",1000,"KK");
		e1.display();
		
	}

}

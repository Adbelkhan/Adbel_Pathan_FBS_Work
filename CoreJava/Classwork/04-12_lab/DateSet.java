class Date
{
  int day, month, year;
  String dow;
  void display()
  {
   System.out.println("Date :" + this.day);
   System.out.println("Month :" + this.month);
   System.out.println("Year :" + this.year);
   System.out.println("Dow :" + this.dow);
  }
  void setDay(int d)
  {
    this.day =d;
  }
  void setMonth(int d)
  {
    this.month =d;
  }
  void setYear(int d)
  {
    this.year =d;
  }
  void setDow(String d)
  {
    this.dow = d;
  }

  int getDay()
  {
    return this.day;
  }
  
}
class TestDate
{
  public static void main(String args[])
  {
    Date d1; 
    d1= new Date();
    d1.setDay(2);
    d1.setMonth(12);
    d1.setYear(2025);
    d1.setDow("Thursday");
    d1.display();

    Date d2= new Date();
    d2= new Date();
    d2.setDay(4);
    d2.setMonth(11);
    d2.setYear(2023);
    d2.setDow("Thursday");
    d2.display();

    if(d1.getDay() < d2.getDay())
    {
      System.out.println("d1 is elder");
    }
    else
    {
      System.out.println("d1 is younger");
    }
    

    
  }
}

import java.util.Scanner;
class Date
{
  int day, month, year;
  String dow;
  
  Date()
  {
     this.day=5;
     this.month=12;
     this.year=2025;
     this.dow="Thursday";
  
     System.out.println("default constructor get call"+"\n");
  }
  
  Date(int day, int month, int year, String dow)
  {
     this.day=day;
     this.month=month;
     this.year=year;
     this.dow=dow;
 
     System.out.println("Parameterised constructor get call"+"\n");
  }
 
  void display()
  {
   System.out.println("Date :" + this.day);
   System.out.println("Month :" + this.month);
   System.out.println("Year :" + this.year);
   System.out.println("DOW :" + this.dow);
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
  int getMonth()
  {
    return this.month;
  }
  int getYear()
  {
    return this.year;
  }
  String getDow()
  {
    return this.dow;
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
    
    d1.getDay();
    d1.getMonth();
    d1.getYear();
    d1.getDow();

    d1.display();

    Date d2= new Date(8,12,2025,"Monday");
   
    Date d3=new Date();
    Scanner sc=new Scanner(System.in);
     
    System.out.println("Enter an Day");
    int day=sc.nextInt();

    System.out.println("Enter an Month");
    int month=sc.nextInt();

    System.out.println("Enter an Year");
    int year=sc.nextInt();

    sc.nextLine();
     
    System.out.println("Enter DOW");
    String dow=sc.nextLine();

    
    System.out.println("Entered  Day " +day);
    System.out.println("Entered  Month " + month);
    System.out.println("Entered  Year " +year);
    System.out.println("Entered  DOW " +dow);
    
  }
}

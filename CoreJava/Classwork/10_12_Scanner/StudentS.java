import java.util.Scanner;
class Student 
{
   int FRN;
   String name;
   double distance;

   Student()
   {
     this.FRN=110;
     this.name= "Jack";
     this.distance= 4.5;
     System.out.println("default constructor get call"+"\n");
   }
   
   Student(int FRN, String name, double distance)
   {
     this.FRN=FRN;
     this.name= name;
     this.distance= distance;
     System.out.println("Parameterised constructor get call"+"\n");
   }


   void display()
  {
   System.out.println("FRN :" + this.FRN);
   System.out.println("Name :" + this.name);
   System.out.println("Distance :" + this.distance);
  }
  
  void setFRN(int s)
  {
     this.FRN = s;
  }
  void setName(String s)
  {
     this.name = s;
  }
  void setDistance(double s)
  {
     this.distance = s;
  }

  int getFRN()
  {
    return this.FRN;
  }
  String getName()
  {
    return this.name;
  }
  double getDistance()
  {
    return this.distance;
  }
  


}// class student ends here

class TestStudent
{
   public static void main(String args[])
   {
     Student s1;
     s1= new Student();
     s1.setFRN(112);
     s1.setName("Adbel");
     s1.setDistance(70);

     s1.getFRN();
     s1.getName();
     s1.getDistance();

     
     s1.display();
     Student s2=new Student(90,"Rahul",90);
          
     Student s3=new Student();
     Scanner sc=new Scanner(System.in);
     
     System.out.println("Enter an Frn");
     int FRN=sc.nextInt();
    
     sc.nextLine();
     
     System.out.println("Enter Name");
     String name=sc.nextLine();
     
     System.out.println("Enter Distance");
     double distance=sc.nextDouble();

     System.out.println("Entered Frn" +FRN);
     System.out.println("Enter Name" +name);
     System.out.println("Enter Distance" +distance);
     
   }

}// TestStudent ends here

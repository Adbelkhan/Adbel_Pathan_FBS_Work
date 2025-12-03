class Student 
{
   int FRN;
   String name;
   double distance;
   void display()
  {
   System.out.println("FRN :" + this.FRN);
   System.out.println("Name :" + this.name);
   System.out.println("Distance :" + this.distance);
  }


}// class student ends here

class TestStudent
{
   public static void main(String args[])
   {
     Student s1;
     s1= new Student();
     s1.FRN = 112;
     s1.name = "Adbel";
     s1.distance = 70;
     s1.display();
     System.out.println("\n" + s1.FRN + "\n" + s1.name + "\n" + s1.distance);
   }

}// TestStudent ends here



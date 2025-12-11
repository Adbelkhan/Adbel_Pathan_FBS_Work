import java.util.Scanner;

class Product 
{
   int Pid, quantity;
   String name;
  
   Product()
   {
     this.Pid=67;
     this.quantity=55;
     this.name="Samgsung";
     System.out.println("default constructor get call"+"\n");
   }
   
   Product(int Pid, int quantity, String name)
   {
     this.Pid=Pid;
     this.quantity=quantity;
     this.name=name;
     System.out.println("Parameterised constructor get call"+"\n");
   }

   void display()
   {
     System.out.println("Pid :" + this.Pid);
     System.out.println("Name :" + this.name);
     System.out.println("Quantity :" + this.quantity);
     
   }
   
   void setPid(int p)
   {
     this.Pid = p;
   }
   void setName(String p)
   {
     this.name = p;
   }
   void setQuantity(int p)
   {
     this.quantity = p;
   }
   
   int getPid()
   {
     return this.Pid;
   }
   String getName()
   {
     return this.name;
   }
   int getQuantity()
   {
     return this.quantity;
   }

   

}// class Product ends here 

class TestProduct
{
   public static void main(String args[])
   {
      Product p1;
      p1 = new Product();
      p1.setPid(109);
      p1.setName("iphonexs");
      p1.setQuantity(10);

      p1.getPid();
      p1.getName();
      p1.getQuantity();

      p1.display(); 
      Product p2=new Product(207,20,"Vivo");
          
      Product p3=new Product();
      Scanner sc=new Scanner(System.in);
     
      System.out.println("Enter an Pid");
      int Pid=sc.nextInt();

      System.out.println("Enter quantity");
      int quantity=sc.nextInt();
    
      sc.nextLine();
     
      System.out.println("Enter Name");
      String name=sc.nextLine();
     
      System.out.println("Entered Pid " +Pid);
      System.out.println("Enter Quantity " +quantity);
      System.out.println("Enter Name " +name);
     

     
   }
}// class TestProduct eds here 
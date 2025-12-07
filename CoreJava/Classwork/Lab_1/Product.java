class Product 
{
   int Pid, quantity;
   String name;
   void display()
   {
     System.out.println("Pid :" + this.Pid);
     System.out.println("Name :" + this.name);
     System.out.println("Quantity :" + this.quantity);
   }
}// class Product ends here 

class TestProduct
{
   public static void main(String args[])
   {
      Product p1;
      p1 = new Product();
      p1.Pid = 109;
      p1.name = "iphonexs";
      p1.quantity = 10;
      p1.display(); 
   }
}// class TestProduct eds here 
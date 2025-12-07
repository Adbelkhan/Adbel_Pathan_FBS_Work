class Product 
{
   int Pid, quantity;
   String name;
  
   Product()
   {
     this.Pid=67;
     this.quantity=55;
     this.name="iphonexs";
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
      Product p1, p2;
      p1 = new Product();
      p1.setPid(109);
      p1.setName("iphonexs");
      p1.setQuantity(10);

      p1.getPid();
      p1.getName();
      p1.getQuantity();

      p1.display(); 
      p2 = new Product();
      p2.display();
   }
}// class TestProduct eds here 
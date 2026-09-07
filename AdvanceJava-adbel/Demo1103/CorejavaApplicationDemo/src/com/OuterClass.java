package com;

public class OuterClass {
	
	private int Oval=1000;
	
	public void print()
	{
		System.out.println("Outer class data is "+Oval);
	//	System.out.println("Accessing data of the inner class"+iVal);
	}
	
	//1 Simple Inner class 
	
	class InnerClass
	{
		private int iVal=9000;
		//private static int sVal;// simple inner classes doesnt support static declaretion 
		
		public void iPrint()
		{
			System.out.println("Inner class data is "+iVal);
			System.out.println("Accessing data of the outer class"+Oval);
		}
	}

	// 2 Static inner class 
	
     static class StaticInnerClass
	{
		private int val=900;
		private static int data =850;
		
		private static void display()
		{
			System.out.println("I am static inner class");
		}
	}
     
     
     //Method local inner class 
     
     public void test()
     {
    	 int data =900;
    	 System.out.println("Method data is..."+data);
    	 
    	 //method local inner class
    	 class A
    	 {
    		 int val=767;
    		 
    		 public void print()
    		 {
    			 System.out.println("Inner class data is...."+val);
    		 }
    	 } // end of the class
    	 
    	 A a1 = new A();
    	 a1.print();
     }

	public static void main(String[] args) 
	{
		OuterClass O1= new OuterClass();
	    O1.print();
	    
	    InnerClass i=O1.new InnerClass(); // outer class qualification i.e reff
	    i.iPrint();
	    
	    // static inner class
	    
	    StaticInnerClass s1 = new StaticInnerClass();
	    s1.display();

	}

}

/*
 * class Test { public static void main(String[] args) { OuterClass O1= new
 * OuterClass(); O1.print();
 * 
 * InnerClass i=O1.new InnerClass(); // outer class qualification i.e reff
 * i.iPrint();
 * 
 * // static inner class
 * 
 * StaticInnerClass s1 = new StaticInnerClass(); s1.display();
 * 
 * }
 * 
 * }
 */
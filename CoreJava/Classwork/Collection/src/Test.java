
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

 class Test {

	public static void main(String[] args) 
	{
      List <Integer>L1;
       
      //L1 = new ArrayList();
      
       L1 = new LinkedList <Integer> ();
     //  L1.add("FirstBit");
       
       L1.add(10);
       L1.add(30);
       L1.add(20);
      // System.out.println(L1);
       
		/*
		 * for(int i=0; i<L1.size(); i++) { System.out.println(L1.get(i)); }
		 */
       
		/*
		 * for(Object o : L1) { System.out.println(o); }
		 */
       
       for(Integer i : L1)
       {
    	   System.out.println(i);
       }
       
       // for search 
       if(L1.contains(220))
       {
    	   System.out.println("Found");
       }
       else
       {
    	   System.out.println("Not Found");
       }
       
       

	}

}

//Print strong numbers in the given range 1 to n.
// n=1000;

void main()
{
	for(int k=1; k<=1000; k++)
	{
		int no=k, temp=no, sum=0 ;
		
		while(no>0)
		{
		  int rem=no%10;
		  int fact=1;
		
		  for(int i=1; i<=rem; i++)
		  {
			fact=fact*i;
	   	  }
		    sum=sum+fact;
	    	no=no/10;
	    }
		
		if(sum==temp)
		{
			printf(" %d ", k);
		}
	}
	
}
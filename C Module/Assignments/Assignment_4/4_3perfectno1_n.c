//Print perfect numbers in the given range 1 to n.

void main()
{
	for(int k=1; k<=1000; k++)
	{
		int no=k;
		int sum=0;
		
		for(int i=1; i<no; i++)
		{
			if(no%i==0)
			{
				sum=sum+i;
			}
		}
		  if(sum==k)
		  {
		  	printf(" %d ", sum);
		  }
	}
}
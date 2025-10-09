//Print armstrong numbers in the given range 1 to n.

void main()
{
	int rem;
	
	for(int k=1 ; k<=1000 ; k++)
	{
		int no = k;
		int sum=0, temp=no;
		
		for(int i=k ; no>0 ; i++)
		{
			rem = no%10;
			sum =sum+rem*rem*rem;
			no = no/10;
		}
		if(sum==temp)
		{
			printf(" %d  ",sum);
		}
	}
}
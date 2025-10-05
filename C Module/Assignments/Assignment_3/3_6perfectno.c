//Check the given number is Perfect number or not.
//Input: n = 28
//Output: Perfect

void main()
{
	int n= 28, sum = 0;
	int i =1;
	
	while(i<=n/2)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
		i++;
		
	}
	if(sum==n)
	{
		printf("%d is perfect no", n );
	}	
		else
		{
			printf("%d not perfect", n);
		}
	
}
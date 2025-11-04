// prime no using pattern 

void main()
{
	int no=3;
	for(int i=1; i<=5; i++)
	{
		for(int j=1; j<=i; j++)
		{
			int res = isPrime(no);
			if(res==1)
			printf("%d",res);
		//	printf("* ");
			
		}
		printf("\n");
	}
}

int isPrime(int no)
{
	for(int i=2; i<no; i++)
	   if(no%i==0)
	     return 0;
	    else
	     return 1;
}
void main()
{
	
	int start;
	int end;
	
	printf("Enter the range \n");
	scanf("%d %d", &start , &end);
	
	int sum=0;
	for(int i=start; i<=end; i++)
	{
		if(i%2==1)
	     sum = sum+i;
	}
	printf("sum :%d", sum);
}
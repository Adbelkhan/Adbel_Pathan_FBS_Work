
int findSum();

void main()
{
  printf("The sum is %d", findSum());
}

int findSum()
{
	int sum=0 , no ;
	
	printf("enter no \n");
	scanf("%d",&no);
	
	for(int i=1; i<=no; i++)
	{
		sum= sum+i;
	}
	
	return sum;
}
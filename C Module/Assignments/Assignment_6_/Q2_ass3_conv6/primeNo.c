
int primeNot();

void main()
{
	int ret=  primeNot();
	if(ret==1)
	printf("Not Prime");
	else
	printf("Prime");
}

int primeNot()
{
	int no, flag=0;
	
	printf("Enter no\n");
	scanf("%d", &no);
	
	for(int i=2; i<=no/2; i++)
	{
		if(no%i==0)
		{
			flag=1;
			break;
		}
	}
	if(flag==1)
	return 1;
	else
	return 0;
}
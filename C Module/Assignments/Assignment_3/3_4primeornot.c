//Check the given number is prime or not.
//Input: n = 7
//Output: Prime

void main()
{
	int no =7 , flag=0;
	int i = 2;
	while(i<=no/2)
	{
		if(no%i==0)
		{
			flag=1;
			break;
		}
		i++;
	}
	if(flag==1)
	{
		printf("Not prime");
	}
	else
	{
		printf("Prime");
	}
}
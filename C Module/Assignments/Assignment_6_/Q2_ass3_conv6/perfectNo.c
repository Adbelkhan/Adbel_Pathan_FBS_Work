// perfect no

#include<stdio.h>

int perfectNo();

void main()
{
	if(perfectNo())
	printf("perfect no");
	else
	printf("not perfect");
}

int perfectNo()
{
	int no, sum=0;
	
	printf("Enter no\n");
	scanf("%d",&no);
	
	int temp=no;
	
	for(int i=1; i<=no/2; i++)
	{
		if(no%i==0)
		{
			sum=sum+i;
		}
	}
	return temp==sum;
}
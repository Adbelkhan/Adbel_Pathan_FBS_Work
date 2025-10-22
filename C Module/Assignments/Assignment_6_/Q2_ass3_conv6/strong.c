// strong no 
#include<stdio.h>

int strong();

void main()
{
  if(strong())
  printf("strong");
  else
  printf("not strong");	
}

int strong()
{
	int no, rem , sum=0, fact;
	
	printf("Enter no\n");
	scanf("%d",&no);
	
	int temp=no;
	
	while(no>0)
	
	{
		rem = no%10;
		fact=1;
	
	for(int i=1; i<=rem; i++)
	{
		fact=fact*i;
		
	}
	
	sum=sum+fact;
	no=no/10;
	
	}
	return temp==sum;
	
	
}
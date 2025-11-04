#include<stdio.h>

void function ()
{
	//int start;
	//int end;
	
//	printf("Enter the range");
//	scanf("%d %d", &start , &end);
	
	odd();
	even();
}

void odd()
{
	for(int j=10; j<=25; j++)
	{
		if(j%2==1)
		printf("%d", j);
	}
}

void even()
{
	for(int k=1; k<=15; k++)
	{
		if(k%2==0)
		printf("%d", k);
	}
}
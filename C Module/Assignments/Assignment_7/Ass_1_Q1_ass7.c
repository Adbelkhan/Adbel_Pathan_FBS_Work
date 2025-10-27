#include<stdio.h>

void evenOdd(int* no);   

void main()
{
	int no;
	printf("Enter number\n");
	scanf("%d", &no);
	
	evenOdd(&no);   
}

void evenOdd(int* no)    
{
	if(*no%2 == 0)
		printf("Even");
	else
		printf("Odd");
}



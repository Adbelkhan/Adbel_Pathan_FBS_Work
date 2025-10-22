#include<stdio.h>

int celToFahr();

void main()
{
//	int f = celToFar();
	printf("%d", celToFar());
}

int celToFar()
{
	int c;
	printf("Enter Celsius \n");
	scanf("%d", & c);
	
	return (c*9/5)+32;
}
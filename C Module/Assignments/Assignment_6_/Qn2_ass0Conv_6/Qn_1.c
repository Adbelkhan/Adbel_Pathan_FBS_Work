#include<stdio.h>

int addTwo();

void main()
{
 	//int ret= addTwo();
 	printf("%d", addTwo());
	
}
int addTwo()
{
	int a, b, sum;
	printf("Enter a \n");
	scanf("%d %d", &a ,&b);
	
	return a+b;
}
// Write a program find power of any number 

#include <stdio.h>
void main()
{
	int base, exp;
	printf("Enter base: ");
	scanf(" %d",&base);
	
	printf("Enter exp: ");
	scanf(" %d", &exp);
	
	int power=1;
	for(int i=1; i<=exp; i++)
	{
		power=power*base;
	}
	printf("The power is:%d",power);
}
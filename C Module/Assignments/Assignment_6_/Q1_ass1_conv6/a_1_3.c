#include<stdio.h>

void leapyear();

void main ()
{
	leapyear();
}

void leapyear()
{
	int year;
	printf("Enter year \n");
	scanf("%d",& year);
	
	if(year%4==0 && year%100!=0 || year%400==0)
	printf("leap year");
	else
	printf("Not leap year");
}
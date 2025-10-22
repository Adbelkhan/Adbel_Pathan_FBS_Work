// sum of digits

#include<stdio.h>

int sumDigits();

void main()
{
	printf("%d",sum, sumDigits());
}

int sumDigits()
{
	int no = 12345 , sum , ld ;
	
	ld = no%10;
	no = no/10000;
	sum ld+no;
	return sum;
}
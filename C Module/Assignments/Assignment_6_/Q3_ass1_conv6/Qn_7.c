#include<stdio.h>

void salary(double basic);

void main()
{
	double basic;
	printf("Enter basic \n");
	scanf("%lf", &basic);
	
	salary(basic);
	
}

void salary(double basic)
{
	double da,ta,hra ,total;
	
	if(basic <=5000)
	{
		da =basic*0.10;
		ta =basic*0.20;
		hra =basic*0.25;
	}
	else
	{
		da =basic*0.15;
		ta =basic*0.25;
		hra =basic*0.30;
	}
	
	total= basic+da+ta+hra;
	printf("Total salary %2lf", total);
	
}
#include<stdio.h>

float areaOfCircle();

void main()
{
	//float area = areaOfCircle();
	printf("%f", areaOfCircle());
}   

float areaOfCircle()
{
	
	float r;
	
	printf("Enter r \n");
	scanf("%f", &r);
	
	float pi = 3.14;
	return pi*r*r;
	//printf("Area of circle %f is ", area);
} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
#include<stdio.h>

int perimeterOf();

void main()
{
//	int ret = perimeterOf();
 	printf("The Perimeter is %d",perimeterOf());
 	return 0;
}

int perimeterOf()
{
	int length , width ;
	
	printf("Enter length and width \n");
	scanf("%d %d", &length, &width);
	
//	printf("Enter width \n");
//	scanf("%d", &width);
	
	return 2*length+width;
}
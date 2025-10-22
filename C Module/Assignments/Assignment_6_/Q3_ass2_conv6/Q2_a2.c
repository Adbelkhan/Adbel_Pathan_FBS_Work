#include<stdio.h>

void threeSides(int side1, int side2, int side3);

void main()
{
	int side1; 
	printf("Enter side1 \n");
    scanf("%d",& side1 );
    
	int side2; 
	printf("Enter side2 \n");
    scanf("%d",& side2 );
    
	int side3 ;
	
	printf("Enter side3 \n");
    scanf("%d",& side3 );
	threeSides(side1, side2, side3);
}

void threeSides(int side1, int side2, int side3)
{
	if(side1==side2 && side2==side3)
		printf("The triangle is equilateral");
	      else if(side1==side2 || side1==side3 || side2==side3)
	        printf("isoscles");
	          else 
	            printf("scalen");
}

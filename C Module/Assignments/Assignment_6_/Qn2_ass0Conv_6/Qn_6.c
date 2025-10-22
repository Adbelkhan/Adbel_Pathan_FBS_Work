#include<stdio.h>

int areaOfTri();

void main()
{
 //	int areaOfTriangle = areaOfTri();
 	printf("%d", areaOfTri() );
	
}
int areaOfTri()
{
	int base, height, areaOfTriangle;
	
	printf("Enter base and height \n");
	scanf("%d %d", &base, &height);
	
//	printf("Enter height \n");
//	scanf("%d", & height);
//	
	return 0.5*base*height;
}
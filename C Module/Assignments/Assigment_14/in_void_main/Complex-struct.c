//9. Complex (real, imaginary)
#include<stdio.h>

typedef struct Complex
{
	int real;
	int imaginary;
}Complex;

void main()
{
	Complex c1,c2;
	
	c1.real=10;
	c1.imaginary=20;
	
	printf("Enter c2 Complex\n");
	
	printf("Enter c2 real\n");
	scanf("%d",&c2.real);
	
	printf("Enter c2 imaginary\n");
	scanf("%d",&c2.imaginary);
	
	printf("c1 Complex\n");
	
	printf("Complex c1 real no %d\n",c1.real);
	printf("Complex c1 imaginary no %d\n",c1.imaginary);
	
	printf("c2 Complex\n");
	
	printf("Complex c2 real no %d\n",c2.real);
	printf("Complex c2 imaginary no %d\n",c2.imaginary);
}
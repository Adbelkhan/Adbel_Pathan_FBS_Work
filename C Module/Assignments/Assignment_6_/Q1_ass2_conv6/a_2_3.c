#include<stdio.h>

void greaterNo();

void main()
{
	greaterNo();
}

void greaterNo()
{
	
	int a ;
	printf("Enter a \n");
    scanf("%d",& a );
    
    int b ;
	printf("Enter b \n");
    scanf("%d",& b );
	 
	int c ;
	printf("Enter c \n");
    scanf("%d",& c );
	
	
	
	if(a>b)
	if(a>c)
		printf("a is greater");	
		else 
		printf("c is greater");
		else 
	    if(b>c)
		printf("b is greater");
	    else 
		printf("c is greater");
}
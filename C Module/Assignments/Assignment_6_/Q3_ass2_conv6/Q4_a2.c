#include<stdio.h>

void result(int marks);

void main()
{
	int marks;
	
	printf("Enter marks \n");
    scanf("%d",& marks );
	result(marks);
}

void result(int marks)
{
    
	if(marks>=75)
		printf("Distinction");
	else if(marks>=65)
			printf("First class");
		else if(marks>=55)
			printf("Second Class");
			else if(marks>=40)
				printf("Pass ");
				else
					printf("fail");
				
}
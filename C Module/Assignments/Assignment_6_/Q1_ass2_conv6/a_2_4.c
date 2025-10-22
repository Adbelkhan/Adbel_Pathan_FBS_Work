#include<stdio.h>

void marks();

void main()
{
	mars();
}

void marks()
{
	int marks;
	
	printf("Enter marks \n");
    scanf("%d",& marks );
    
	if(marks>=75)
	{
		printf("Distinction");
	}
	else
	{
		if(marks>=65)
		{
			printf("First class");
		}
		else 
		{
			if(marks>=55)
			{
				printf("Second Class");
			}
			else 
			{
				if(marks>=40)
				{
					printf("Pass ");
				}
				else
				{
					printf("fail");
				}
			}
		}
	}
}
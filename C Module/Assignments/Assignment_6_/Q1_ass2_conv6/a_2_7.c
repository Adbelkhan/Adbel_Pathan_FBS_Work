#include<stdio.h>

void age();

void main()
{
	age();
}

void age()
{
	
	
	int age;
	printf("Enter age \n");
    scanf("%d",& age );
    
    
	if(age<12)
		printf("child");
	else if(age>=12 && age<=19)
			printf("teenager");
		else if(age>=20 && age<=59)
				printf("adult");
			else if(age>=60)
					printf("senior");
}
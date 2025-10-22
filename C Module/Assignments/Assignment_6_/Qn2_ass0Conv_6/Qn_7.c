#include<stdio.h>

float studPer();

void main()
{
 //	float percentage = studPer();
 	printf("%f", studPer());
	
}

float studPer()
{
	float marathi , hindi, english, geo , history, total, percentage;
	
	printf("Enter Marks in Marathi \n");
	scanf("%f", &marathi);
	
	printf("Enter Marks in Hindi \n");
	scanf("%f", &hindi);
	
	printf("Enter Marks in English \n");
	scanf("%f", &english);
	
	printf("Enter Marks in Geo \n");
	scanf("%f", &geo);
	
	printf("Enter Marks in History \n");
	scanf("%f", &history);
	
	total = (marathi+ hindi + english + geo +history);
	return total*100/500;
}
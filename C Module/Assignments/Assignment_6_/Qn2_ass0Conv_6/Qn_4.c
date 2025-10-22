#include<stdio.h>

int avgNo();

void main()
{
 	//int average = avgNo();
 	printf("Average of no is : %d", avgNo());
	
}

int avgNo()
{

	int no1,no2,no3,no4,no5, total , average;
	
	printf("Enter no1 no2 no3 no4 no5 \n");
	
	scanf("%d %d %d %d %d", &no1, &no2, &no3, &no4, &no5);
	
	total = (no1+no2+no3+no4+no5);
	
	return total/5;
}
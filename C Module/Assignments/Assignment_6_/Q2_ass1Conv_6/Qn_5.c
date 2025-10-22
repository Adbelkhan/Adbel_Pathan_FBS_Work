#include<stdio.h>
int vote();
 
void main()
{
	//int ret = vote();
	if(vote())
	printf("Eligible for vote");
	else
	printf("Not Eligible");
}

int vote()
{
	int age;
	printf("Enter age \n");
	scanf("%d",&age);
	
	return age>=18;
//	return 1;
//	else
//	return 0;
}
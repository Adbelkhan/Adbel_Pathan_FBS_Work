#include<stdio.h>
void vote(int age);
 
void main()
{
	int age;
	printf("Enter age \n");
	scanf("%d",&age);
	
	vote(age);
}

void vote(int age)
{
	
	if(age>=18)
	printf("Eligible for vote");
	else
	printf("Not Eligible");

}
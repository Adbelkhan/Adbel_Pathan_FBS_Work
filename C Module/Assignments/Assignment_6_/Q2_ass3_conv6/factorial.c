// factorial

#include<stdio.h>
int fact();

void main()
{
	printf("The fact is %d", fact());
}

int fact()
{
	int no, fact =1;
	
	printf("Enter no\n");
	scanf("%d",&no);
	
	for(int i=1; i<=no; i++)
	{
		fact= fact*i;
	}
	
	return fact;
	
}
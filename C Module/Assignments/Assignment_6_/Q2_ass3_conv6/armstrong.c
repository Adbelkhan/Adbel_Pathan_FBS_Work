

#include<stdio.h>
int armstrong();

void main()
{
	if(armstrong())
	printf("armstrong");
	else
	printf("Not armstrong");
}

int armstrong()
{
	int no, sum=0, rem;
	
	printf("Enter no\n");
	scanf("%d",&no);
	
	int temp=no;
	
	for(; no>0; no=no/10)
	{
		rem = no%10;
		sum= sum+rem*rem*rem;
	}
	
	return temp==sum;
	//return 1;
	//else
//	return 0;
}
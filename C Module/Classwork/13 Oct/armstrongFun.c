#include<stdio.h>

void main()
{
	int no;
	printf("enter a number\n");
	scanf("%d",&no);
	int res=isarmstrong(no);
	if(res==1)
	  printf("armstrong");
	else
	  printf("Not armstrong");
}

int getCount(int no)
{
	int count=0;
	while(no>0)
	{
        count++;
		no=no/10;		
	}
	return count;
}

int getPower(int base, int exp)
{
	int res=1;
	for(int i=1; i<=exp; i++)
	{
		res=res*base;
	}
	return res;
}

int isarmstrong(int no)
{
	int temp=no, sum=0;
	
	int count=getCount(no);
	
	while(no>0)
	{
		int rem=no%10;
		sum=sum+getPower(rem,count);
		no=no/10;
	}
	
	if(temp==sum)
	  return 1;
	else
	  return 0;
}
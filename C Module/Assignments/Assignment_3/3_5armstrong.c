//Check the given number is Armstrong number or not..
//Input: n = 153
//Output: Armstrong
#include<stdio.h>
void main()
{
	int no = 123 ;
	int rem , sum=0, temp=no;
	while(no>0)
	{
		rem = no%10;
		sum = sum+rem*rem*rem;
		no  = no/10;
		
		//no==sum;
		//flag = 1;
		
	}
	if(sum==temp)
	{
		printf("No is armstrong %d", sum);
	}
	else
	{
		printf("not armstrong");
	}
}
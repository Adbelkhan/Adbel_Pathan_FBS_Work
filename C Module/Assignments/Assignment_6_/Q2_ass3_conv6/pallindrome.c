// pallindrom or not 

#include<stdio.h>
int  pallindromeNo();
 
void main()
{
	
	if(pallindromeNo())
	printf(" Pallindrome");
	else
	printf("Not Pallindrome");
}

int pallindromeNo()
{
	int no;
	
	printf("Enter no \n");
	scanf("%d", &no);
	
	int rev=0 , rem ,temp=no;
	
	while(no>0)
	{
		rem =no%10;
		rev = rev*10+rem;
		no = no/10;
	}
	return rev==temp;
	   	
	
}
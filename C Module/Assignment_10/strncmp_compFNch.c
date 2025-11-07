#include<stdio.h>
#include<string.h>

void main()
{
	int n=3;
	int result;
	char str1[6]="hello";
	char str2[6]="hello";
	
	result = strncmp(str1,str2,n);
	
	if(result==0)
	  printf("first %d character of bothe is same\n",n);
	else if(result == -1)
	  printf("first string %d character is greater\n",n);
    else
	  printf("Second string %d character is greater\n",n);
	
}
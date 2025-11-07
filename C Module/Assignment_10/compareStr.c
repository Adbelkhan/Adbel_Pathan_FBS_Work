#include <stdio.h>
#include<string.h>

void main()
{
	
	int compare;
	char str1[6];
	printf("Enter the arr string\n");
	scanf("%s",str1);
	
	char str2[6];
	printf("Enter the brr string\n");
	scanf("%s",str2);
	
	
	compare= strcmp(str1,str2);
	
	if(compare==0)
		printf("first two n character is equal");
	else if(compare ==1)
	     printf("first n character is greater");
	else
	    printf("second string n character is greater");     
	
	
	
	
}
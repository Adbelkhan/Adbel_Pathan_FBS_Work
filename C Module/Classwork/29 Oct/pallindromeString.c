// wap to check the string is pallindrome or not 
#include<stdio.h>
void main()
{
	char str[]="";
	char org[10];
	printf("Enter string\n");
	scanf("%s",str);
	
	strcpy(org, str);
	
	strrev(str);
	printf("rev string %s\n",str);
	
	int res = strcmp(str,org);
	
	if(res==0)
	  printf("Pallindrome");
	else
	  printf("Not pallindrome");  
	
}
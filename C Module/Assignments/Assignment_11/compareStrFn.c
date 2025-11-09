//Strings user define function
//j. mystrcasecmp
#include<stdio.h>
#include<string.h>
void compareString(char*,char*);
void main()
{
	char str1[20];
	printf("Enter first string\n");
	gets(str1);
	
	char str2[20];
	printf("Enter second string\n");
	gets(str2);
	
	compareString(str1,str2);
	
}
void compareString(char* str1, char* str2)
{
	int res = strcasecmp(str1,str2);
	
	if(res==0)
	  printf("String is same");
	else if(res >0)
	  printf("String 1 is greater");
	else
	  printf("String 2 is greater");    
}
//Strings user define function
//i. mystrstr
#include<stdio.h>
#include<string.h>
void mystrstr(char*,char*);
void main()
{
	char str1[20];
	printf("Enter first string\n");
	gets(str1);
	
	char str2[20];
	printf("Enter second string\n");
	gets(str2);
	
	mystrstr(str1,str2);
}
void mystrstr(char* str1, char* str2)
{
	char* ptr = strstr(str1,str2);
	
	if(ptr)
	  printf("The Substring found at position %ld",ptr-str1+1);
	else
	  printf("Substring not found");  
}


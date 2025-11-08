#include<stdio.h>
#include<string.h>

void main()
{
	
	char str[10];
	int length;
	
	printf("Enter a string \n");
	gets(str);
	
	length=strlen(str);
	
	printf("length is = %d",length - 1);
}
#include<stdio.h>
#include<string.h>

void main()
{
	
	char str[10];
	int length;
	
	printf("Enter a string \n");
	fgets(str, sizeof(str),stdin);
	
	length=strlen(str);
	
	printf("length is = %d",length - 1);
}
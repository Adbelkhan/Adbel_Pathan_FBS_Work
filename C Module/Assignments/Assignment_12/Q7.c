//7. WAP to Remove the Characters of Odd Index Values in a String

#include<stdio.h>
#include<string.h>
char* removeChOdd(char*,int);
void main()
{
	char str[20];
	printf("Enter string\n");
	gets(str);
	
	char* res=removeChOdd(str,20);
	printf("The final string is %s",res);
}
char* removeChOdd(char* ptr, int size)
{
	for(int i=0; i<size; i++)
	{
		if(i%2==1)
		{
			ptr[i]=' ';
		}
	}
	return ptr;
}
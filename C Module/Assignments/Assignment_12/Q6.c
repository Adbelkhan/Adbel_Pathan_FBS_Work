//6. WAP to Take in a String and Replace Every Blank Space with special symbol.

#include<stdio.h>
#include<string.h>
char* replaceSpace(char*, int);
void main()
{
	char str[20];
	printf("Enter string\n");
	gets(str);
	
	char*res = replaceSpace(str,20);
	printf("Replace blank space with special symbol %s",res);
	
	
}
char* replaceSpace(char* ptr, int size)
{
	for(int i=0 ;i<size; i++)
	{
		if(ptr[i]==' ')
		{
			ptr[i]='$';
		}
	}
	
	return ptr;
}
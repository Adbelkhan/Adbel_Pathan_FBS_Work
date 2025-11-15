//8. WAP to Calculate the Number of Words Present in a String

#include<stdio.h>
#include<string.h>
int calculateWords(char*,int);
void main()
{
	char str[20];
	printf("Enter string\n");
	gets(str);
	
	int res= calculateWords(str,20);
	printf("The Words present in string is: %d",res+1);
	
	
}

int calculateWords(char* ptr,int size)
{
	int count=0;
	int len =strlen(ptr);
	for(int i=0; i<len; i++)
	{
		if(ptr[i]==' ')
		{
			count=count+1;
		}
	}
	return count;
}
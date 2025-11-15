//3. WAP to Remove the nth Index Character from a Non-Empty String
#include<stdio.h>
#include<string.h>
char* removeIndex(char*, int);
void main()
{
	char str[10];
	printf("Enter string\n");
	gets(str);
	
	int n;
	printf("Enter index no\n");
	scanf("%d",&n);
	
	char* res=removeIndex(str,n);
	
	if(res != NULL)
	printf("After removing %d index %s",n,res);
}

char* removeIndex(char* str, int n)
{
	int len= strlen(str);
	if(n<0 || n>=len)
	{
		printf("Invalid index\n");
		return NULL;
	}
	else
	{
		for(int j=n; str[j] !='\0'; j++)
	    {
			str[j]=str[j+1];
		}
		return str;
	}  
	
}
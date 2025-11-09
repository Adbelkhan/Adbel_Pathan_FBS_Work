//Strings user define function
//h. mystrrev

#include<stdio.h>
#include<string.h>
void mystrrev(char*);
void main()
{
	char str[10];
	printf("Enter the string\n");
	gets(str);
	
	mystrrev(str);
	printf("Reverse string is : %s",str);
}
void mystrrev(char* str)
{
	int i,j;
	j=strlen(str)-1;
	for(i=0; i<=j; i++,j--)
	{
		char temp= str[i];
		str[i]=str[j];
		str[j]=temp;
	}
	
}
//Strings user define function
//b. mystrlen

#include<stdio.h>
#include<string.h>
int mystrlen(char*);
void main()
{
	char str[15];
	
	printf("Enter string");
	fgets(str,15,stdin);
	
	int res = mystrlen(str);
	printf("The length of string %d ", res);
}

int mystrlen(char* str)
{
	int i=0;
	while(str[i]!='\0')
	{
		i++;
	}
	
	return i;
}

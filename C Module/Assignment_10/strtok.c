//split string into tokens hello,hi = hello
//hi

#include<stdio.h>
#include<string.h>

void main()
{
	char str[20]="hello,how,are,you";
	char* token;
	
	token = strtok(str, ",");
	
	while(token != NULL)
	{
		printf("%s\n",token);
		token=strtok(NULL, ",");
	}
}
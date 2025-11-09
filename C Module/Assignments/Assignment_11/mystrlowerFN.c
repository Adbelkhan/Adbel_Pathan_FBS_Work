//Strings user define function
//g. mystrlower

#include<stdio.h>
#include<string.h>
void mystrlower(char* str);
void main()
{
	char str[15];
	printf("Enter the string\n");
	gets(str);
	
	mystrlower(str);
	printf("The lower case string is %s",str);
}
void mystrlower(char* str)
{
	int i=0;
	for(i=0; str[i] !='\0'; i++)
	{
		if(str[i]>='A' && str[i]<='Z')
		{
			str[i]=str[i]+32;
		}
	}
}

//Strings user define function
//f. mystrupper

#include<stdio.h>
#include<string.h>
void mystrupper(char* str);
void main()
{
	char str[10];
	printf("Enter the string\n");
	gets(str);
	
	mystrupper(str);
	printf("Uppercase string is : %s",str);
}
void mystrupper(char* str)
{
	int i=0;
	
	for(i=0; str[i] !='\0'; i++)
	{
		if(str[i]>='a' && str[i]<='z')
		{
			str[i]=str[i]-32;
		}
	}
}
//Strings user define function
//d. mystrcat
#include<stdio.h>
#include<string>
void mystrcat(char* , char*)
void main()
{
	char str1[15];
	char str2[15];
	
	printf("Enter first string\n");
	gets(str1);
	
	printf("Enter first string\n");
	gets(str2);
	
	mystrcat(str1,str2);
	
	printf("Together string is %s",str1);
}

void mystrcat(char* str1, char* str2)
{
	int i=0, j=0;
	
	while(str1[i] !='\0')
	i++;
	
	while(str2[j] !='\0')
	{
		str1[i]=str2[j];
		i++;
		j++;
	}
	str1[i]='\0';
}
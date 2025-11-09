// Strings user define function
//c. mystrcmp
#include<stdio.h>
#include<string.h>

void mystrcmp(char* ,char*);
void main()
{
	char str1[10];
	char str2[10];
	
	printf("enter first string \n");
	gets(str1);
	
	printf("enter second string \n");
	gets(str2);
	
	mystrcmp(str1,str2);
		
}

void mystrcmp(char* str1, char* str2)
{
	int i=0;
	
	while(str1[i]==str2[i])
	{
		if(str1[i]=='\0')
		{
			printf("String are same");
			return;
			
		}
		i++;
	}
	
	if(str1[i]>str2[i])
	    printf("first string is greater");
	else
	    printf("second string is greater");	  	
}
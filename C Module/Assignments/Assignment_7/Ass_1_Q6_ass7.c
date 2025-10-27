#include<stdio.h>

void ulCase(char* ch);

void main()
{
	char ch;
	printf("Enter char \n");
	scanf("%c",&ch);
	
	ulCase(&ch);
}

void ulCase(char* ch)
{
	
	if(*ch>='A' && *ch<='Z') 
    printf("Uppercase");
	else
	printf("Lowercase");
}
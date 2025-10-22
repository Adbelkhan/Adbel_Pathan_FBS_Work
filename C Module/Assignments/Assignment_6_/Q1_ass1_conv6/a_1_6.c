#include<stdio.h>

void upperlowerCase();

void main()
{
	upperlowerCase();
}

void upperlowerCase()
{
	char ch;
	
	printf("Enter char \n");
	scanf("%c",& ch);
	
	if(ch>='A'&&ch<='Z')
		printf("Uppercase");
	else
		printf("Lowercase");
}
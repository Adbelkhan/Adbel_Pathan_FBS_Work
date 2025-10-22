#include<stdio.h>

char ulCase();

void main()
{
	//char ret= ulCase();
	if(ulCase())
	printf("Uppercase");
	else
	printf("Lowercase");
}

char ulCase()
{
	char ch;
	printf("Enter char \n");
	scanf("%c",&ch);
	
	return ch>='A' && ch<='Z';
//	return 1;
//	else
//	return 0;
}
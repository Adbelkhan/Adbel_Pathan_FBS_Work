//1. Write a program to scan string from user then scan a single character and search it
//in a accepted string.


#include<stdio.h>

int searchStr(char*, char);
void main()
{
	int i;
	char str[10]="";
	printf("Enter string\n");
    gets(str);
	
	char ch;
	printf("Enter character\n");
	scanf("%c",&ch);
	
		
    int Position=searchStr(str,ch);
    if(Position !=0)
	printf("character %c found at position %d",ch, Position+1);
	else
	printf("Entered character not found");	
}

int searchStr(char* str, char ch)
{
	int i=0, found=0;
	while(str[i]!='\0')
	{
		if(str[i]==ch)
		{
			return 1;
			break;
		}
		i++;
	}
    return 0;
	

}
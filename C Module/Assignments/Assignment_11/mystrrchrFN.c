//Strings user define function
//l. mystrrchr
#include<stdio.h>
#include<string.h>
void mystrrchr(char*,char);
void main()
{
	char str[10];
	printf("ENter the string\n");
	gets(str);
	char ch;
	printf("Enter the character\n");
	scanf("%c",&ch);
	
	mystrrchr(str,ch);
	
}
void mystrrchr(char*str,char ch)
{
	int j, found =0;
	j=strlen(str)-1;
	for(; j>=0;j--)
	{
		if(str[j]==ch)
		{
			printf("last occurance character %c is at position %d",ch,j);
			found=1;
			break;
		}
	}
    if(!found)
        printf("character not found");
}
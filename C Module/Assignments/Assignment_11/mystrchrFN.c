//Strings user define function
//k. mystrchr

#include<stdio.h>
#include<string.h>
void mystrchr(char*,char);
void main()
{
	char str[10];
	printf("ENter the string\n");
	gets(str);
	char ch;
	printf("Enter the character\n");
	scanf("%c",&ch);
	
	mystrchr(str,ch);
	
}
void mystrchr(char*str,char ch)
{
	int ,found =0;
	for(int i=0; str[i]!='\0'; i++)
	{
		if(str[i]==ch)
		{
			printf("First occurance character %c is at position %d",ch,i);
			found=1;
			break;
		}
	}
    if(!found)
        printf("character not found");
}
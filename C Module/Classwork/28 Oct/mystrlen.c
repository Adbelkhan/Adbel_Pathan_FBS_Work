#include<stdio.h>
int mystrlen(char *str);
void main()
{
	char str[]="";
	printf("Enter string\n");
	scanf("%s",&str);
	
	int i = mystrlen(str);
	
	printf("The length of stringis : %d",i);
}

int mystrlen(char *str)
{
	int i=0;
		while(str[i]!='\0')
		{
			i++;
		}
		return i;
}


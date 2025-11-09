//Strings user define function
//a. mystrcpy
#include<stdio.h>
#include<string.h>
void mystrcpy(char*,char*);
void main()
{
	char src[20];
	char dest[20];
	
	printf("Enter the string\n");
    gets(src);
		
	mystrcpy(dest,src);
	printf("Copied string is : %s",dest);
	
	
}

void mystrcpy(char*dest,char*src)
{
	int i=0, j=0;
	
	while(dest[i] !='\0')
	i++;
	
	while(src[j] !='\0')
	{
		dest[i]=src[j];
		i++;
		j++;
	}
	dest[i]='\0';
}
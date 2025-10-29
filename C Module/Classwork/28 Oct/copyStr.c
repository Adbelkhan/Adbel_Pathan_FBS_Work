// calculate the length of string
#include<stdio.h>
void main()
{
	char str[]="hello";
	char ptr[10];
	printf("Before copy ptr= %s",ptr);
	
	int i=0;
	while(str[i]!='\0')
	{
		ptr[i]=str[i];
		i++;
	}
	
	ptr[i]='\0';
	printf("\nAfter copy ptr= %s",ptr);
}
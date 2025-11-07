#include<stdio.h>
#include<string.h>

void main()
{
	char *res;
	char ch= 'l';
	char str[6]="apple";
	
	res= strchr(str,ch);
	
	if(res !='\0')
	  printf("character %c found at position : %ld\n",ch, res-str);
	else
	  printf("Character not found"); 
	

}
#include<stdio.h>
#include<string.h>

void main()
{
	char ch='b';
	char str[10]="firstbit";
	char* res;
	
	res=strrchr(str,ch);
	
	if(res !='\0')
	   printf("Last occurance of %c character position is : %ld",ch,res-str);
	else
	   printf("Character Not found");	
}
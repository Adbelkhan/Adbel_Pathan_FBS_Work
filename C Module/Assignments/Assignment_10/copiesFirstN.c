// copies first n character

#include<stdio.h>
#include<string.h>

void main()
{
	int n=3;
	char str[10]="Firstbit";
	char dest[10];
     
		
	strncpy(dest,str,n);	
	dest[n]='\0';
    printf("After Copy string: %s ",dest);	
}
	
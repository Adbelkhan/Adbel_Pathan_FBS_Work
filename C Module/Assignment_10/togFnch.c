// add together first n char and print

#include<stdio.h>
#include<string.h>

void main()
{
	int n=8;  
	char str[15]="Firstbit";   
	char dest[15]="bit";    
     	
	strncat(dest,str,n);  	
    
    printf("After Concatenate: %s ",dest);	
}
	
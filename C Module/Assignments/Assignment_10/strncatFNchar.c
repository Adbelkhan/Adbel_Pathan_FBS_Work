// add together first n char and print

#include<stdio.h>
#include<string.h>

void main()
{
	int n=2;  
	char str[10]="Firstbit";   
	char dest[10]="bit";    
     	
	strncat(dest,str,n);  	
    
    printf("After Concatenate: %s ",dest);	
}
	
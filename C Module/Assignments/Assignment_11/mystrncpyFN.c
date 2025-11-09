//Strings user define function
//e. mystrncpy

#include<stdio.h>
#include<string.h>

void mystrncpy(char*, char*, int*);
void main()
{
	int n;
	char src[15];
	char dest[25];
	
	printf("Enter first string\n");
	gets(src);
	
	printf("Enter number of character to copy string\n");
	scanf("%d",&n);
	
    mystrncpy(dest,src,&n);
    
    printf("Cpied string n is : %s",dest);
}
void mystrncpy(char* dest, char* src, int* n)
{
	int i=0;
	
	for(i=0; i!= *n; i++)
	dest[i]=src[i];
}

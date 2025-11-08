// duplicate string 

#include<stdio.h>
#include<string.h>
#include<stdlib.h>

void main()
{
	char str[20]="firstBit Solution";
	
	char* copy = strdup(str);
	
	printf("Original  : %s\n", str);
	printf("Duplicate : %s\n",copy);
	
	free(copy);	
}
//built-in functions of string in program.
// copy sting

#include<stdio.h>
#include<string.h>

void main()
{
	char str[10];
	char dest[10];
	int length;
	
	printf("Enter a string ");
//	fgets(str,sizeof(str), stdin);
    gets(str);	
	printf("before copy string: %s \n",str);
	strcpy(dest, str);
    
    printf("After copy string: %s ",dest);	
	
	
}
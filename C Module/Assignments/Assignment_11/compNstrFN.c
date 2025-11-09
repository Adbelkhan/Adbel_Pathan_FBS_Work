//Strings user define function
//m. mystrncmp

#include<stdio.h>
#include<string.h>
void compNstr(char* str1, char* str2, int n);
void main()
{
	char str1[20];
	printf("Enter first string\n");
	gets(str1);
	char str2[20];
	printf("Enter second string\n");
	gets(str2);
	
	int n;
	printf("Enter n length\n");
	scanf("%d",&n);
	
	compNstr(str1,str2,n);
}
void compNstr(char* str1, char* str2, int n)
{
	int i;

    for(i = 0; i < n; i++)
    {
        // stop if any string ends or characters are not same
        if (str1[i] == '\0' || str2[i] == '\0' || str1[i] != str2[i])
            break;
    }

	
		if(i==n)
		   printf("First %d characetr is same ",n);
		else if(str1[i]>str2[i])
		   printf("First string is greater");
		else
		   printf("second string is greater");      
	
}
//Strings user define function
//p. mystrncasecmp

#include<stdio.h>
#include<string.h>
void mystrnCaseCmp(char*, char*,int);
void main()
{
	char str1[20];
	printf("Enter first string\n");
	gets(str1);
	
	char str2[20];
	printf("Enter second string\n");
	gets(str2);
	
	int n;
	printf("Enter n\n");
	scanf("%d",&n);
		
	mystrnCaseCmp(str1,str2,n);
	
}
void mystrnCaseCmp(char* str1, char* str2,int n)
{
    int i = 0;
    char c1, c2;

    while(str1[i] !='\0' && str2[i] !='\0')
    {
        c1 =str1[i];
        c2 =str2[i];

        if(c1 >='A' && c1 <='Z')
            c1 =c1 + 32;
        if(c2 >='A' && c2 <='Z')
            c2 =c2 + 32;

        if(c1 != c2)
            break;

        i++;
    }
    if(i == n)
        printf("First %d characters are same", n);
    else if(c1 > c2)
        printf("First string is greater");
    else if(c1 < c2)
        printf("Second string is greater");
    else
        printf("Strings are equal");
}
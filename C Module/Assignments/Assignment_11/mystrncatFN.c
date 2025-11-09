//Strings user define function
//d. mystrncat
#include<stdio.h>
#include<string.h>
void mystrncat(char* , char*,int);
void main()
{
	char str1[15];
	char str2[15];
	int n;
	
	printf("Enter first string\n");
	gets(str1);
	
	printf("Enter first string\n");
	gets(str2);
	
	printf("Enter n\n");
	scanf("%d",&n);
	
	mystrncat(str1,str2,n);
	
	printf("Together string is %s",str1);
}

void mystrncat(char* str1, char* str2,int n)
{
	int i=0, j=0; 
	while (str1[i] != '\0')
    i++;
	
	while(str2[j] !='\0'&& j<n)
	{
		str1[i]=str2[j];
		i++;    
		j++;
	}
		str1[i]='\0';
}

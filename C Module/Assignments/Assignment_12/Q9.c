//9. WAP to Take in Two Strings and Display the Larger String without Using Built-in
//Functions
#include<stdio.h>
#include<string.h>
char* displayLargest(char*, char*);
void main()
{
	char str1[20];
	printf("Enter string 1\n");
	gets(str1);
	
	char str2[20];
	printf("Enter string 2\n");
	gets(str2);
	
	char* res= displayLargest(str1,str2);
	
	printf("largest string is %s\n",res);
	
	
}
char* displayLargest(char* str1, char* str2)
{
	int i=0, j=0, count1=0, count2=0;

    while(str1[i] !='\0')
    {
	    count1 =count1+1;
		i++;
	}
	
	while(str2[j] !='\0')
	{
		count2 =count2+1;
		j++;
	}
        
	
	if(count1>count2)
	return  str1;
	else
	return str2;
	
}
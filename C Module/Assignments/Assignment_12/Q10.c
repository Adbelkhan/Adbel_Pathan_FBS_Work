//10. Write a program to check the string is palindrome or not.

#include<stdio.h>
#include<string.h>
int stringPalindrome(char*);
void main()
{
	char str[10];
	printf("Enter string\n");
	gets(str);
	
	int res= stringPalindrome(str);
	if(res !=0)
	printf("The string is Not palindrome\n");
	else
	printf("The string is palindrome\n");
}

int stringPalindrome(char* str)
{
	int i=0, j=0, len=0, flag=0;
	while(str[len] !='\0')
	len++;
	
	j=len -1;
	
	while(i<j)
	{
		if(str[i] != str[j])
		{
			flag=1;
		    break;
		}
		i++;
		j--;	
	}
    if(flag==1)
	return 1;
	else
	return 0;	
}
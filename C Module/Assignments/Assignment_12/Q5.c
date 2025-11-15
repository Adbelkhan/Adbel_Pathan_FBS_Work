//5. WAP to Count the Number of Vowels in a String

#include<stdio.h>
#include<string.h>
int countVowels(char*, int);
void main()
{
	char str[10]="";
	printf("enter string\n");
	gets(str);
	
	int res=countVowels(str,10);
	printf("The number of vowels in string :%d",res);
}

int countVowels(char* str, int size)
{
	int i=0 , count=0;
	int len=strlen(str);
	for(int i=0; i<len; i++)
	{
		if(str[i]=='a'|| str[i]== 'e' || str[i]=='i' || str[i]=='o'
		   || str[i]=='u' || str[i]=='A' || str[i]=='E' || str[i]=='I' 
		   || str[i]=='O' || str[i]=='U')
		   {
		   	count=count+1;
		   }
	}
	return count;
	  
}
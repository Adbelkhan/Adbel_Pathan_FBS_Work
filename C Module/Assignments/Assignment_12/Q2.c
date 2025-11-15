//WAP Replace all Occurrences of ‘a’ with $ in a String
#include<stdio.h>

char*  replaceChar(char* str);
void main()
{
	char str[10]="";
	printf("Enter string\n");
    scanf("%s",str);
		
	char* finalstr= replaceChar(str);
	printf("%s",finalstr);	
}

char* replaceChar(char* ptr)
{
	int i=0;
	while(ptr[i]!='\0')
	{
		if(ptr[i]=='a')
		{
			ptr[i]='$';
		}
		i++;
	}
	return ptr;

}
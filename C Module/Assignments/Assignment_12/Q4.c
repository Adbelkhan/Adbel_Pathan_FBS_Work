//4. WAP to Form a New String where the First Character and the Last Character have
//been Exchanged

#include<stdio.h>
#include<string.h>
char* exchangeCh(char*);
void  main()
{
	char str[10];
	printf("Enter string\n");
	gets(str);
	
	char* res=exchangeCh(str);
	if(res != NULL)
    printf("First and Last Character Exchanged string is %s", res);
}
char* exchangeCh(char* str)
{
	int len= strlen(str);
	if(len<2)
	{
		printf("You dont need to swap\n");
		return NULL;
	}
	else
	{
		char temp=str[0];
		str[0]=str[len-1];
		str[len-1]=temp;
		
		return str;
	}

}
//strcspn 
#include<stdio.h>
#include<string.h>

void main()
{
	char str1[15]="i am from india";
	char str2[15]="oc";
	
	char* result=strcspn(str1,str2);
	printf("no of non matching character before om is %d",result);
}
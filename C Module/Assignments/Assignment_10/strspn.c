#include<stdio.h>
#include<string.h>

void main()
{
	char arr[50]="abcde123";
	char brr[20]="abc";
	
	int len = strspn(arr,brr);
	
	printf("Length of initial segment containing only 'abc' = %d",len);
}
//find first matching character

#include<stdio.h>
#include<string.h>

void main()
{
	char arr[15]="how are you";
	char brr[15]="ymm";
	
	char* res = strpbrk(arr,brr);
	

	
	if(*res!='\0')
	   printf("First Matching character is : %ld", res-arr);
	else
	   printf("Not found character");   
}
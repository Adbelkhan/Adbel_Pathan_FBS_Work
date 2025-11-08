#include<stdio.h>
#include<string.h>

void main()
{
	char arr[20]="firstbit solution";
	char brr[10]="sol";
	
	char* res= strstr(arr,brr);
	
	if(res)
	   printf("substring found at position  %ld",res-arr);
	else
	   printf("Substring not found");   
}
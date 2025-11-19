//Que 2: Check if the array is palindrome or not (using function)
#include<stdio.h>
void storeArray(int*, int);
void palindromeArr(int*, int);
void main()
{
	int arr[5];
	printf("enter Array Elements\n");
	storeArray(arr,5);
	
	palindromeArr(arr,5);
}
void storeArray(int* ptr, int size)
{
	for(int i=0; i<size; i++)
	{
		scanf("%d",&ptr[i]);
	}
}
void palindromeArr(int*ptr, int size)
{
	int flag=0;
	for(int i=0, j=size-1; i<size/2; i++,j--)
	{
	   if( ptr[i] !=ptr[j])
	   {
	   	 flag=1;
	   }
	}
	
	if(flag==1)
	printf("Not Pallindrome");
	else
	printf("Pallindrome");
}
	
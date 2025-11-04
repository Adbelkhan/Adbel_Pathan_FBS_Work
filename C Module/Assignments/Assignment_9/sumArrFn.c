#include<stdio.h>
void sumArr(int*arr,int* brr, int* crr, int size);
void storeArray(int* ptr, int size);
void main()
{
	int arr[5];
	int brr[5];
	int crr[5];
	
	printf("enter elements arr 1\n");
	storeArray(arr,5);
	printf("enter elements arr 2\n");
	storeArray(brr,5);
	
	sumArr(arr,brr,crr,5);
	
}
void storeArray(int* ptr, int size)
{
	for(int i=0; i<size; i++)
	{
		scanf("%d",&ptr[i]);
	}
}

void sumArr(int*arr,int* brr, int*crr, int size)
{
	for(int i=0; i<size; i++)
	{
		crr[i]=arr[i]+brr[i];
	}
	
	printf("addition of 1 and 2 array is [");
	for(int i=0; i<size; i++)
	{
		printf("%d",crr[i]);
	}
	printf("]");
}
#include<stdio.h>

void main()
{
	int arr[5];
	int brr[7];
	int crr[10];
	
	storeArray(arr,5);
	storeArray(arr,7);
	storeArray(arr,10);
}

storeArray(int *ptr, int size)
{
	for(int i=0; i<size; i++)
	{
		scanf("%s",&ptr[i]);
	}
}
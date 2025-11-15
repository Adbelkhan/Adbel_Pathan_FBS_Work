//9. Reverse the given array.using malloc

#include<stdio.h>
#include<stdlib.h>
void storeArray(int*, int);
void revArray(int*, int);
void main()
{
	int* arr=(int*)malloc(sizeof(int)*10);
	printf("Enter Array elements\n");
	storeArray(arr,10);
	
	revArray(arr,10);
}
void storeArray(int* ptr, int size)
{
	for(int i=0; i<size; i++)
	{
		scanf("%d", &ptr[i]);
	}
}
void revArray(int* arr, int size)
{
	for(int i=0, j=size-1; i<size/2; i++,j--)
	{
		int temp= arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	printf("arr [");
	for(int i=0; i<size; i++)
	{
		printf(" %d",arr[i]);
	}
	printf("]");
}
#include<stdio.h>
void storeArray(int* ptr, int size);
void alternetEle(int* ptr, int size);
void main()
{
	int arr[6];
	printf("Enter arry element\n");
	storeArray(arr,6);
	
	alternetEle(arr,5);
	
}
void storeArray(int* ptr, int size)
{
	for(int i=0; i<size; i++)
	{
		scanf("%d",&ptr[i]);
	}
}

void alternetEle(int* ptr, int size)
{
	printf("Arr [");
	for(int i=0; i<size; i=i+2)
	{
		printf(" %d",ptr[i]);
	}
	printf("]");
}


#include<stdio.h>
void storeArray(int* ptr, int size);
void arrEvOd(int* ptr, int size);

void main()
{
	int arr[5], res, size;
	printf("Enter element in array 1\n");
	storeArray(arr,5);
	
	arrEvOd(arr,5);
	
}

void storeArray(int* ptr, int size)
{
	for(int i=0; i<size; i++)
	{
		scanf("%d",&ptr[i]);
	}
}


void arrEvOd(int* ptr, int size)
{
	printf("even [");
	for(int i=0; i<size; i++)
	{
		if(ptr[i]%2==0)
		printf("%d ",ptr[i]);
		
	}
	printf("]\n");
	
	printf("odd [");
	for(int i=0; i<size; i++)
	{
		if(ptr[i]%2!=0)
		printf("%d ",ptr[i]);
	}
	printf("]\n");
}


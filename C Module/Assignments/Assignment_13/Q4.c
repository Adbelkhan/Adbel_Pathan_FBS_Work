//4. Find odd and even among the numbers. using malloc

#include<stdio.h>
#include<stdlib.h>
void storeArray(int*, int);
void evenOdd(int*, int);
void main()
{
	int* arr=(int*)malloc(sizeof(int)*5);
	
	printf("enter array elements\n");
	storeArray(arr,5);
	
	evenOdd(arr,5);
}
void storeArray(int* arr, int size)
{
	for(int i=0; i<size; i++)
	{
		scanf("%d",&arr[i]);
	}
}
void evenOdd(int* arr, int size)
{
    printf("even [");
	for(int i=0; i<size; i++)
	{
		if(arr[i]%2==0)
		{
			printf(" %d",arr[i]);
		}	
	}
	printf("]\n");
	
	printf("odd [");
	for(int i=0; i<size; i++)
	{
		if(arr[i]%2 !=0)
		{
			printf(" %d",arr[i]);
		}	
	}
	printf("]");
	
	
}
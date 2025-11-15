//5. Print alternate elements in array. using malloc

#include<stdio.h>
#include<stdlib.h>
void storeArray(int*,int);
void alternateArray(int*, int);
void main()
{
	int* arr=(int*)malloc(sizeof(int)*10);
	printf("Enter Array elements\n");
	
	storeArray(arr,10);
	
	printf("Alternate Array elements\n");
	alternateArray(arr,10);
}
void storeArray(int* arr,int size)
{
	for(int i=0; i<size; i++)
	{
		scanf("%d",&arr[i]);
	}
}
void alternateArray(int* arr, int size)
{
	printf("arr [");
	for(int i=0; i<size; i=i+2)
	{
		printf(" %d",arr[i]);	
	}
	printf("]");
}
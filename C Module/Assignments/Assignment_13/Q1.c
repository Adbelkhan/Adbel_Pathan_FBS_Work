//1. Find minimum and maximum number in array. using malloc
#include<stdio.h>
#include<stdlib.h>

void storeArray(int*, int);
void minMaxArray(int*, int);
void main()
{
	int min, max;
	int* arr=(int*)malloc(sizeof(int)*5);

	printf("Enter arraay elements\n");
	storeArray(arr,5);
	
	minMaxArray(arr,5);
	
}
void storeArray(int* arr, int size)
{
	int i;
	for(i=0; i<size; i++)
	{
		scanf("%d",&arr[i]);
	}
}

void minMaxArray(int* arr, int size)
{
	int min=arr[0];
	int max=arr[0];
	
	for(int i=0; i<size; i++)
	{
		if(arr[i]<min)
		min=arr[i];
		else if(arr[i]>max)
		max=arr[i];
		
	}
	printf("Minimum number is %d and maximum number is %d",min,max);
}




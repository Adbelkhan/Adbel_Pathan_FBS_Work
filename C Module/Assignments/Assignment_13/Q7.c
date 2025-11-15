//7. Take two array and add sum in third array Example-
//arr[5]= {1,2, 3, 4,5}
//brr[5]={10,20,30, 40, 50}
//crr[5]={11,22,33,44,55}

#include<stdio.h>
#include<stdlib.h>
void storeArray(int*,int);
void sumTwoArray(int*,int*,int*,int);
void main()
{
	int* arr=(int*)malloc(sizeof(int)*5);
	int* brr=(int*)malloc(sizeof(int)*5);
	int* crr=(int*)malloc(sizeof(int)*5);
	
	printf("Enter Array 1 elements\n");
	storeArray(arr,5);
	
	printf("Enter Array 2 elements\n");
	storeArray(brr,5);
	
	sumTwoArray(arr,brr,crr,5);
	
	
}
void storeArray(int* ptr,int size)
{
	for(int i=0; i<size; i++)
	{
		scanf("%d",&ptr[i]);
	}
}

void sumTwoArray(int*arr,int*brr,int*crr,int size)
{
	for(int i=0; i<size; i++)
	{
		crr[i]=arr[i]+brr[i];
	}
	
	printf("crr [");
	for(int i=0; i<size; i++)
	{
		printf(" %d",crr[i]);
	}
	printf("]");
}














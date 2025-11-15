//8. Merge two arrays using malloc

#include<stdio.h>
#include<stdlib.h>
void storeArray(int*, int);
void mergArray(int*, int, int*, int , int*, int);
void main()
{
	int s1=5, s2=5, s3=10;
	int* arr=(int*)malloc(sizeof(int)*s1);
	int* brr=(int*)malloc(sizeof(int)*s2);
	int* crr=(int*)malloc(sizeof(int)*s3);
	
	printf("Enter array 1 elements\n");
	storeArray(arr,s1);
	
	printf("Enter array 2 elements\n");
	storeArray(brr,s2);
	
	mergArray(arr,s1,brr,s2,crr,s3);
}
void storeArray(int* ptr, int size)
{
	for(int i=0; i<size; i++)
	{
		scanf("%d",&ptr[i]);
	}
	
}
void mergArray(int* arr, int s1, int* brr, int s2, int* crr, int s3)
{
	for(int i=0; i<s1; i++)
	{
		crr[i]=arr[i];
		
		for(int i=s2, j=0; j<=s3; i++,j++)
		{
			crr[i]=brr[j];
		}
	}
	
	printf("crr [");
	for(int i=0; i<s3; i++)
	{
		printf(" %d",crr[i]);
	}
	printf("]");
	
}
//3. Find sum of all numbers. using malloc

#include<stdio.h>
#include<stdlib.h>
void storeArray(int*, int);
void sumArray(int*, int);
void main()
{
	int* arr=(int*)malloc(sizeof(int)*5);
	
	printf("Enter array elements\n");
	storeArray(arr,5);
	
	sumArray(arr,5);
}
void storeArray(int* arr, int size)
{
	for(int i=0; i<size; i++)
	{
		scanf("%d",&arr[i]);
	}
}
void sumArray(int* arr, int size)
{
	int sum=0;
	for(int i=0; i<size; i++)
	{
		sum=sum+arr[i];
	}
	printf("Sum of all numbers in array is %d",sum);
}
//10. Sort the array. using malloc 
#include<stdio.h>
#include<stdlib.h>
void storeArray(int*, int);
void sortArray(int*, int);
void main()
{
	int* arr=(int*)malloc(sizeof(int)*5);
	printf("Enter Array elements\n");
	storeArray(arr,5);
	
	printf("The sorted array is : ");
	sortArray(arr,5);
}
void storeArray(int* ptr, int size)
{
	for(int i=0; i<size; i++)
	{
		scanf("%d", &ptr[i]);
	}
} 
void sortArray(int* arr, int size)
{
	for(int i=0; i<size; i++)
	{
		for(int j=0; j<size-1-i; j++)
	   {
		  if(arr[j]>arr[j+1])
		  {
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
	      }	
	   }
	
	}
	
	printf(" arr [");
	for(int i=0; i<size; i++)
	{
		printf("%d",arr[i]);
	}
	printf("]");
}
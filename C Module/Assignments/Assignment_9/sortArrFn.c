#include<stdio.h>
void sortArray(int* arr, int s1);
void storeArray(int* ptr, int s1);
void main()
{
	int s1=6;
	int arr[s1];
	
	printf("enter array element\n");
	storeArray(arr,s1);
	
	sortArray(arr,s1);
}

void storeArray(int* ptr, int s1)
{
	for(int i=0;  i<s1; i++)
	{
		scanf("%d",&ptr[i]);
	}
}

void sortArray(int* arr, int s1)
{
	int temp;
	for(int i=0;i<s1-1; i++)
	{
		for(int j=0; j<s1-1-i; j++)
		{
			if(arr[j]>arr[j+1])
			{
				temp= arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	printf("sorted = [");
	for(int i=0; i<s1; i++)
	{
		printf(" %d",arr[i]);
	}
	printf("]");
	
}
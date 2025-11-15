//2. Search the given number in array. using malloc
#include<stdio.h>
#include<stdlib.h>
void storeArray(int*, int);
void searchArray(int*, int);
void main()
{
	int* arr=(int*)malloc(sizeof(int)*5);
	
	printf("Enter array elements\n");
	storeArray(arr,5);
    
	searchArray(arr,5);	
}
void storeArray(int* arr, int size)
{
	for(int i=0; i<size; i++)
	{
		scanf("%d",&arr[i]);
	}
}
void searchArray(int* arr, int size)
{
	int no, flag=0, i;
	printf("Enter no you want to search\n");
	scanf("%d",&no);
	
	for(i=0; i<size; i++)
	{
		if(arr[i]==no)
		{
			flag=1;
		    break;
		}
	}
	
	if(flag==0)
	printf("Enter no is not found");
	else
	printf("Enter no= %d is found at index %d",no,i+1);
}

#include<stdio.h>
void reverseArr(int*  arr,int s1);
void storeArray(int* ptr, int size);

void main()
{
	int s1=10;
	int arr[s1];
	printf("enter array element\n");
	storeArray(arr,s1);
	
	reverseArr(arr,s1);
}

void storeArray(int* ptr, int size)
{
	for(int i=0; i<size; i++)
	{
		scanf("%d",&ptr[i]);
	}
}

void reverseArr(int* arr,int s1)
{
	for(int i=0, j=s1-1; i<s1/2; i++,j--)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	printf("reverse = [");
	for(int i=0; i<s1; i++)
	{
		printf(" %d",arr[i]);
	}
	printf("]");
}
// store 3 array element and display 
#include <stdio.h>

void storeArray(int* ptr, int size);
void displayArray(int* ptr, int size);
void main()
{
	int arr[5];
	int brr[7];
	int crr[10];
	
	printf("Enter element in array 1\n");
	storeArray(arr,5);
	printf("Enter element in array 2\n");
	storeArray(brr,7);
	printf("Enter element in array 3\n");
	storeArray(crr,10);
	
	displayArray(arr,5);
	
	int ele=10;
	int res=search(arr,5,ele);
	if(res!=-1)
	  printf("found at %d index",res);
	else
	  printf("not found");
	
	displayArray(brr,7);
	displayArray(crr,10);
	
}

int search(int* ptr, int size, int ele)
{
	for(int i=0; i<size; i++)
	{
		if(ptr[i]==ele)
		 return i;
	}
	 return -1;
}

int storeArray(int* ptr , int size)
{
	
	for(int i=0; i<size; i++)
	{
		scanf("%d",&ptr[i]);
	}
	
}	

int displayArray(int* ptr , int size)
{
	printf("\n[");
	for(int i=0; i<size; i++)
	{
		printf(" %d,",ptr[i]);
	}
	printf("\b]");
}
	

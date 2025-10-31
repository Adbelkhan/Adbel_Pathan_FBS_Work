//10. Sort the array.
#include<stdio.h>
void main()
{
	int n=5, temp;
	int arr[n];
	printf("Enter array element\n");
	
	for(int i=0; i<n; i++)
	{
		scanf("%d",&arr[i]);
	}
	
	for(int i=0; i<n-1; i++)
	{
		for(int j=0; j<n-1-i; j++)
		{
			if(arr[j] < arr[j+1])
			{
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	
	printf("sorted array \n"); 
	printf("[");
	for(int i=0; i<n; i++)
	{
		printf(" %d",arr[i]);
	}
	printf("]");
}
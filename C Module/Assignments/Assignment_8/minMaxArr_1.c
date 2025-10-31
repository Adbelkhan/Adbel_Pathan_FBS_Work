//1. Find minimum and maximum number in array.
#include <stdio.h>

void main()
{
	int arr[5];
	int i;
	
	printf("Enter Elements\n");
	for(i=0; i<5; i++)
	{
		scanf("%d",&arr[i]);
	}
	
     int max=arr[0], min=arr[0];
	for(i=0; i<5; i++)
	{
		
		if(arr[i]>max)
		max= arr[i];
		else if(arr[i]<min)
		min= arr[i];
		
	}
	
		printf("The Maximum Array Element is :%d\n",max);
		printf("The Minimum Array Element is :%d",min);
}
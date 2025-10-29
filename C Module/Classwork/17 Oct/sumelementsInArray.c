// Get the sum of all elemnnts present in array
#include <stdio.h>

void main()
{
	int arr[5];
	int i, sum=0;
	
	printf("Enter element\n");
	for(i=0; i<5; i++)
	{
		scanf("%d",&arr[i]);
		
		sum=sum+arr[i];
	}
	
	printf("The sum of array is:%d", sum);
	
}
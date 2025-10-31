//3. Find sum of all numbers.

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
	
	printf("The sum of arr is:%d", sum);
	
}
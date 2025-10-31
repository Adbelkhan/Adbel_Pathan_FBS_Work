//4. Find odd and even among the numbers.

#include <stdio.h>

void main()
{
	int arr[4];
	int i;
	
	printf("Enter the element\n");
	for(i=0; i<4; i++)
	{
		scanf(" %d ",&arr[i]);
		
	}
	
	
	for(i=0; i<4; i++)
	{
		if(arr[i]%2==0)
		printf("even arr is :%d \n",arr[i]);
		else
		printf("Odd arr is :%d \n",arr[i]);
    }
    
}
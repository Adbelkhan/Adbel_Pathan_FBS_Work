//6. Accept array and print only prime numbers of array.
#include <stdio.h>

void main()
{
	int n=6;
	int arr[n];
	int i, flag,no;
	printf("Enter array element\n");
	for(i=0; i<n; i++)
	{
		scanf("%d",&arr[i]);
	}
	
	for(int i=0; i<n; i++)
	{
		int no=arr[i], flag=0;
		for(int j=2; j<=no/2; j++)
		{
			if(arr[i]%j==0)
			{
				flag=1;
				break;
			}
		}
		
		if(flag==0)
	    printf(" %d",arr[i]);
	}
	
	
	
	
}
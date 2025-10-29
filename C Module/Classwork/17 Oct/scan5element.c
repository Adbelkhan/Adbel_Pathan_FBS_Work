#include <stdio.h>

void main()
{

	int arr[5];
	int i;
	
	printf("Enter element\n");
	for(i=0; i<5; i++)
	{
		scanf("%d", &arr[i]);
	}
		
	int ele, flag=0;
	
	printf("Search element\n");
	scanf("%d",&ele);
	
	
	for(i=0; i<5; i++)
	{
		if(arr[i]==ele)
		{
		   printf("found");
		   flag=1;
	       break;
		}
		
	}
	if(flag==0)
	printf("not found");
}
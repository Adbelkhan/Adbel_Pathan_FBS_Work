#include<stdio.h>
void storeArray(int arr[], int n);
int mySearch(int arr[],int n, int ele);
void main()
{
	int arr[5], res,ele,i;
		
    printf("Enter element\n");
    storeArray(arr,5);
		
	printf("Search element\n");
//	scanf("%d",&ele);
	
	res=mySearch(arr,5,ele);
	if(res==1)
	printf("found");
	else
	printf("not found");
}
void storeArray(int arr[], int n)
{
	for(int i=0; i<n; i++)
	{
		scanf("%d", &arr[i]);
	}
}

int mySearch(int arr[],int n, int ele)
{		
    scanf("%d",&ele);
	for(int i=0; i<n; i++)
	{
		if(arr[i]==ele)
		{
		  return 1;
		}	
	}
	
	return 0;
	
}
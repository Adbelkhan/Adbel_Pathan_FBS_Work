#include<stdio.h>
int arrSum(int arr[],int n,int sum);
void main()
{
	int arr[5];
	int i, sum=0, add;
	
	printf("Enter element\n");
	for(i=0; i<5; i++)
	{
		scanf("%d",&arr[i]);
	}
	add= arrSum(arr,5,sum);
	printf("The sum of arr is:%d", add);
	
}

int arrSum(int arr[],int n,int sum)
{
	for(int i=0; i<5; i++)
	{
    	sum=sum+arr[i];
	}
	
	return sum;
}
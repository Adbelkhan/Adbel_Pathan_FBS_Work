// merg two array

#include<stdio.h>
void arrMerg(int* arr,int s1, int* brr, int s2 ,int* crr, int s3);
void storeArray(int* ptr, int size);
void main()
{
	int s1=5,s2=5;
	int arr[s1];
	int brr[s2];
	int s3=s1+s2;
	int crr[s3];
	
	printf("enter element arr\n");
	storeArray(arr,s1);
	printf("enter element brr\n");
	storeArray(brr,s2);
	
	arrMerg(arr,s1,brr,s2,crr,s3);
}

void storeArray(int* ptr, int size)
{
	for(int i=0; i<size; i++)
	{
		scanf("%d",&ptr[i]);
	}
}

void arrMerg(int* arr,int s1, int* brr, int s2 ,int* crr, int s3)
{
	for(int i=0;i<s1;i++)
	{
		crr[i]=arr[i];
	}
	
	for(int i=0, j=s1; i<s3; i++,j++)
	{
		crr[j]=brr[i];
	}
	
	printf("crr = [");
	for(int i=0; i<s3; i++)
	{
		printf(" %d",crr[i]);
	}
	printf("]");
}
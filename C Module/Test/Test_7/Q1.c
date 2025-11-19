//Q1 write a program to accept array and exchange the data of Xth position to Yth position
//Eg. Arr [] = {11, 23, 30, 4, 21, 45, 50} 
//Xth position = 3 
//Yth position = 4
//o/p: 11 23 21 4 30 45 50 
//(using function)

#include<stdio.h>
void storeElement(int*, int);
void swapPosition(int*, int);
void main()
{
	int arr[7];
	printf("Enter Array Elements \n");
	storeElement(arr,7);
	
	swapPosition(arr,7);
}
void storeElement(int* ptr, int size)
{
	for(int i=0; i<size; i++)
	{
		scanf("%d",&ptr[i]);
	}
}
void swapPosition(int* ptr, int size)
{
	int x;
	printf("Enter Xth position\n");
	scanf("%d",&x);
	
	int y;
	printf("Enter Yth position\n");
	scanf("%d",&y); 
	
	for(int i=0, j=y; i<size;i++)
	{
		if(i == x)
		{
			int temp= ptr[i];
			ptr[i]=ptr[j];
			ptr[j]= temp;
			
		}
	}
	
	for(int i=0; i<size; i++)
	{
		printf(" %d",ptr[i]);
	}	
}
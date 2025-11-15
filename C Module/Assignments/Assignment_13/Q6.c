//6. Accept array and print only prime numbers of array. using malloc

#include<stdio.h>
#include<stdlib.h>
void storeArray(int*,int);
void primeArray(int*, int);
void main()
{
	int* arr=(int*)malloc(sizeof(int)*5);
	printf("Enter Array elements\n");
	
	storeArray(arr,5);
	
	primeArray(arr,5);
	
	
}
void storeArray(int* arr,int size)
{
	for(int i=0; i<size; i++)
	{
		scanf("%d",&arr[i]);
	}
}

void primeArray(int* arr, int size)
{
	int no, flag;
	for(int i=0; i<size; i++)
	{
		flag=0;
		 no=arr[i];
		for(int j=2; j<=no/2; j++)
		{
			if(no%j ==0)
			{
				flag=1;
			    break;	
			}
		}		
	if(flag==0)
	printf("%d",arr[i]);
	}
	
	
}
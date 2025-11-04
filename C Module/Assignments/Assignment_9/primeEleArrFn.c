#include<stdio.h>
void storeArray(int* ptr, int size);
void arrPrime(int* ptr, int size, int* no);
void main()
{
	int arr[6], no, flag=0;
	printf("Enter array element\n");
	storeArray(arr,6);
	
	arrPrime(arr,6,&no);
	
}

void storeArray(int* ptr, int size)
{
	for(int i=0; i<size; i++)
	{
		scanf("%d",&ptr[i]);
	}
}

void arrPrime(int* ptr, int size, int* no)
{
	for(int i=0; i<size; i++)
	{
		int no=ptr[i], flag=0;
		for(int j=2; j<=no/2; j++)
		 {
		 	if(no%j==0)
		 	{
		 		flag=1;
		 	    break;
			}
		 }
		 if(flag==0)
		 printf(" %d",ptr[i]);
	}
}
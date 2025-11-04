//1. Find minimum and maximum number in array.
#include <stdio.h>
void storeArray(int* ptr, int size);
void  arrMinMax(int* ptr, int size, int *min, int *max);
void main()
{
	int arr[5];
	int min, max;
	
	printf("Enter Elements\n");
	storeArray(arr,5);

     arrMinMax(arr,5,&min,&max);
     printf("The Maximum Array Element is :%d\n",*max);
	 printf("The Minimum Array Element is :%d",*min);
     
}
void storeArray(int* ptr, int size)
{
	for(int i=0; i<size; i++) 
	{
		scanf("%d",&ptr[i]);
	}
	
}

void  arrMinMax(int* ptr, int n, int *min, int *max)
{
	  *max=ptr[0];
	  *min=ptr[0];
	 
	for(int i=0; i<n; i++)
	{
		
		if(ptr[i]>*max)
		*max= ptr[i];
		else if(ptr[i]<*min)
		*min= ptr[i];
		
	}
	

}

 
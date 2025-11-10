// write a program in c to find two maximum no in array

void main()
{
	int arr[5]={1,2,3,4,5};
	
	int smax=arr[0];
	int max=arr[0];
	
	for(int i=0; i<=5; i++)
	{
		if(arr[i]>max)
		{
		  smax=max;
		  max=arr[i];	
		}
	}
	
	
	printf("%d %d",max, smax);
}
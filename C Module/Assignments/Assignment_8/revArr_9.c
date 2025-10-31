//9. Reverse the given array.

void main()
{
	int n=10;
	int arr[n];
	
	printf("Enter element of array\n");
	
	for(int i=0; i<n; i++)
	{
		scanf("%d",&arr[i]);
	}
	
	for(int i=0, j=n-1; i<n/2; i++, j--)
	{
		int temp= arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	for(int i=0; i<n; i++)
	{
		printf(" %d",arr[i]);
	}
}
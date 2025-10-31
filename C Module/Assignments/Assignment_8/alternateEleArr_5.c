//5. Print alternate elements in array.

void main()
{
	int n=10; 
	int arr[n];
	
	printf("Enter Array element\n");
		for(int i=0; i<n; i++)
	{
		scanf("%d",&arr[i]);
	}
	
	for(int i=0; i<n; i=i+2)
	{
		printf(" %d",arr[i]);
		
	}
}
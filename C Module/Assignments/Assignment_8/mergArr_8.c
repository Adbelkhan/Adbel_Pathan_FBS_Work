//8. Merge two arrays

void main()
{
	int s1=5, s2=6;
	int arr[s1];
    int brr[s2];
    int s3 = s1+s2;
	int crr[s3];
	
	printf("Enter elements arr\n");
	for(int i=0; i<s1; i++)
	{
		scanf("%d",&arr[i]);
	}
	
	printf("Enter elements brr\n");
	for(int i=0; i<s2; i++)
	{
		scanf("%d",&brr[i]);
	}
	
	for(int i=0; i<s1; i++)
	{
		crr[i]=arr[i];
	}
	
	

	for(int i=0, j=s1; i<s2; i++, j++)
	{
		crr[j]=brr[i];
	}
	
	for(int i=0; i<s3; i++)
	{
		printf(" %d",crr[i]);
	}

	
	
}
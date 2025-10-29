void main()
{
	int a=10, b=0, c=1;
	if(++b || --c && a--)
	{
		printf("Hi");
	}
	else
	{
		printf("bye");
		//printf("%d %d %d",a,b,c);
	}
	printf("%d %d %d",a,b,c);
}
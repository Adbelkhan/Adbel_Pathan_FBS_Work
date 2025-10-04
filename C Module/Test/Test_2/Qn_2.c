//Qn 2 WAP to check if number is positive , negative or netural (0)

void main()
{
	int no = 0;
	if(no>=1 && no<=9)
	{
		printf("%d No is Positive", no);
	}
	else
	{
		if(no<0)
		{
			printf("%d No is Negative", no);
		}
		else
		{
			printf("%d No is Neutral", no);
		}
	}
}
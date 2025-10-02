// find entered char is alphabet or special symbol, digit 
void main()
{
	char ch = '*';
	if(ch>='a' && ch<='z')
	{
		printf("Alphabet");
	}
	else
	{
		if(ch>=0 && ch<=9)
		{
			printf("Digit");
		}
		else
		{
			printf("Symbol");
		}
	}
}
//Find Sum of first and last digit of given number.
//Input: n = 12345
//Output: 6 (1 + 5)

void main()
{
	int no = 12345 , sum , ld ;
	
	ld = no%10;
	while(no>10)
	{
		no = no/10;
	}
	sum = ld+no;
	printf("The sum of First digit and last digit is :%d ", sum);
}
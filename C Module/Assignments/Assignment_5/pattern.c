

void main()
{
	for(int i=1; i<=15; i++)
	{
		for(int j=1; j<=15; j++)
		{
			
			if(i==1&&j<=1 || i==15 && i<=1 || j==1 || j==15 && i>8 || i==j && i<8 || i+j==16 &&i>8 || i==8&& j<8 )
				printf("* ");
			else
			{
				if(j>8&&i<8)
				  printf(". ");
				else
				  printf("  ");
			}
				
		}
		
		printf("\n");
	}
}
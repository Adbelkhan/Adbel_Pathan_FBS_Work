//Print a right-angled triangle pattern
//Input: n = 5
//Output:
//*
//**
//***
//****
//*****

void main()
{
	int n=5;
	for(int i=1; i<=n; i++)
	{
		for(int j=1; j<=i; j++)
		{
			//if(i==1&&j<=1 || i==2&&j<=2 || i==3&&j<=3 ||i==4&&j<=4 || i==5)
			  printf("* ");
			
		}
		printf("\n");
	}
}
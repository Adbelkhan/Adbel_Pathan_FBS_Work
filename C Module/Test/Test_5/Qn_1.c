//1. WAP to calculate selling price of book based on cost price and discount.
//( using function and nested if- else )

#include<stdio.h>

void calSellPrice(int cp, int dis);

void main()
{
	int cp;
	printf("Enter the cost price of book\n");
	scanf("%d",&cp);
	
	int dis;
	printf("Enter the discount percentage\n");
	scanf("%d",&dis);
	
	calSellPrice(cp,dis); 
}

void calSellPrice(int cp, int dis)
{
    int sp;
	if(dis>30 && dis<=50)
	{
		sp= cp-(cp*dis/100);
		printf("High discount %d The Final selling Price of book %d ",dis, sp);
	}
	else if(dis>=10 && dis<=30 )
	{
		sp=cp-(cp*dis/100);
		printf("medium discount %d The Final selling Price of book %d ",dis, sp);
	}
	else if(dis<10 && dis>0)
	{
		sp=cp-(cp*dis/100);
		printf("small discount %d The Final selling Price of book %d ",dis, sp);
	}
	else 
	{
		sp=cp;
		printf("Invalid discount entered! Please enter between 0-60\n ");
	} 
}


    



#include<stdio.h>

void discount(char student, double price);

void main()
{
	char student ;
	printf("If you are student enter y or n \n");
    scanf("%c",& student );
		
	double price ; 
	printf("Enter price \n");
    scanf("%lf",& price );
    
	discount(student, price);
}

void discount(char student, double price)
{
	double fprice;
	if(student=='y')
	{
		if(price>=500)
		{
			fprice = price-price*0.20;
			printf("The price is %lf and discount is 20% , Final price : %lf", price, fprice);
		}
		else
		{
			fprice = price-price*0.10;
			printf("The price is %lf and discount is 10% , Final price : %lf", fprice);
		}
	}
	else
	{
	   	if(price>=600)
	   	{
	   		fprice = price-price*0.15;
	   		printf("%lf", fprice);
		   }
		   else
		   	printf("Not Discount");
		   
	}
}
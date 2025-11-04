//2. WAP to initialize some amount in your account. Then give choice to user for deposit or
//withdraw. and display updated amount. Condition to withdraw (if the balance is less than
//3000 display can't withdraw the amount balance is not sufficient).
//( using function )

#include<stdio.h>
void choice(int balance);
void main()
{
	int balance=5000;
	printf("The balance amount is : %d\n",balance);
	
	choice(balance);
}
void choice(int balance)
{
	int no, amount =0, withdraw=0;
	printf("if deposite enter 1 or withdeaw enter 2\n");
	scanf("%d",&no);
	
	
	if(no==1)
	{
		printf("enter deposite amount\n");
		scanf("%d",&amount);
		
		balance =balance+amount;
		printf("Total amount is : %d",balance);
	}
	else if(no==2)
	{
		printf("enter withdraw amount\n");
		scanf("%d",&withdraw);
		
		if(balance-withdraw>3000)
		{
			balance= balance-withdraw;
			printf("amount is :%d",balance);
		}
		else
		{
			printf("Can't withdraw the amount balance is not sufficient");
		}
			
    }
    else
    {
    	printf("invalid choice\n");
	}
}




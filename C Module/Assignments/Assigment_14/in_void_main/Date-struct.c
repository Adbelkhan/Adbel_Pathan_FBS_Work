//6. Date (date, month, year)

#include<stdio.h>
#include<string.h>

typedef struct Date
{
	int date;
	int month;
	int year;
}Date;

void main()
{
	Date d1,d2;
	
	d1.date=15;
	d1.month=02;
	d1.year=2000;
	
	printf("Enter Date 2 details\n");
	
	printf("Enter date\n");
	scanf("%d",&d2.date);
	
	printf("Enter month\n");
	scanf("%d",&d2.month);
	
	printf("Enter year\n");
	scanf("%d",&d2.year);
	
	printf("Date 1 details\n");
	
	printf("%d-%d-%d\n",d1.date,d1.month,d1.year);
	
	printf("Date 2 details\n");
	
	printf("%d-%d-%d",d2.date,d2.month,d2.year);
	
}
//7. Time (hour, min, sec)
#include<stdio.h>
typedef struct Time
{
	int hour;
	int min;
	int sec;
}Time;

void main()
{
	Time t1,t2;
	
	t1.hour=10;
	t1.min=35;
	t1.sec=10;
	
	printf("Enter Time 2 \n");
	
	printf("Enter hour\n");
	scanf("%d",&t2.hour);
	
	printf("Enter minutes\n");
	scanf("%d",&t2.min);
	
	printf("Enter second\n");
	scanf("%d",&t2.sec);
	
	printf("Time 1 \n");
	
	printf("Hour of t1:%d\n",t1.hour);
	printf("minutes of t1:%d\n",t1.min);
	printf("second of t1:%d\n",t1.sec);
	
	printf("Time 2 \n");
	printf("Hour of t1:%d\n",t2.hour);
	printf("minutes of t1:%d\n",t2.min);
	printf("second of t1:%d\n",t2.sec);
	
}
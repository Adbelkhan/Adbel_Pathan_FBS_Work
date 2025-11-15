//8. Distance ( feet, inch)
#include<stdio.h>
typedef struct Distance
{
	int feet;
	float inch;
}Distance;

void main()
{
	Distance d1,d2;
	
	d1.feet=5;
	d1.inch=3.4;
	
	printf("Enter d2 Distance\n");
	
	printf("enter feet\n");
	scanf("%d",&d2.feet);
	
	printf("enter inch\n");
	scanf("%f",&d2.inch);
	
	printf("d1 Distance\n");
	printf("Feet :%d\n",d1.feet);
	printf("inch :%f\n",d1.inch);
	
	printf("d2 Distance\n");
	printf("Feet :%d\n",d2.feet);
	printf("inch :%f\n",d2.inch);
}
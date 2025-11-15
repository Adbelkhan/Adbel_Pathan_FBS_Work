//5. SalesManager (id, name, salary, incentive, target)
#include<stdio.h>
#include<string.h>
typedef struct SalesManager
{
	int id;
	char name[20];
	double salary;
	double incentive;
	double targt;
}SalesManager;

void main()
{
	SalesManager sm1, sm2;
	
	sm1.id=101;
	strcpy(sm1.name,"Elon");
	sm1.salary=20000;
	sm1.incentive=1000;
	sm1.targt=1000000;
	
	printf("Enter SalesManager 2 details\n");
	
	printf("Enter id\n");
	scanf("%d",&sm2.id);
	
	printf("Enter name\n");
	scanf("%s",sm2.name);
	
	printf("Enter salary\n");
	scanf("%lf",&sm2.salary);
	
	printf("Enter incentive\n");
	scanf("%lf",&sm2.incentive);
	
	printf("Enter target\n");
	scanf("%lf",&sm2.targt);
	
	printf("SalesManager 1 details\n");
	
	printf("id        =%d\n",sm1.id);
	printf("name      =%s\n",sm1.name);
	printf("salary    =%lf\n",sm1.salary);
	printf("incentive =%lf\n",sm1.incentive);
	printf("target    =%lf\n",sm1.targt);
	
	printf("SalesManager 2 details\n");
	
	printf("id        =%d\n",sm2.id);
	printf("name      =%s\n",sm2.name);
	printf("salary    =%lf\n",sm2.salary);
	printf("incentive =%lf\n",sm2.incentive);
	printf("target    =%lf\n",sm2.targt);
	
}

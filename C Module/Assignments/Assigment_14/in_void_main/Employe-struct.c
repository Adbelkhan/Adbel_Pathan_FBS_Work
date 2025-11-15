//2. Employee (id, name, salary)
#include<stdio.h>
#include<string.h>
struct Employee
{
	int id;
	char name[20];
	double salary;
};

void main()
{
	struct Employee e1,e2;
	e1.id=101;
	strcpy(e1.name,"walter");
	e1.salary=20000;
	
	printf("Enter Employee 2 details\n");
	printf("Enter id\n");
	scanf("%d",&e2.id);
	
	printf("Enter Name\n");
	scanf("%s",e2.name);
	
	printf("Enter Salary\n");
	scanf("%lf",&e2.salary);
	
	printf("Employee 1 details\n");
	printf("id     = %d\n",e1.id);
	printf("name   = %s\n",e1.name);
	printf("Salary = %lf\n",e1.salary);
	
	printf("Employee 2 details\n");
	printf("id     = %d\n",e2.id);
	printf("name   = %s\n",e2.name);
	printf("Salary = %lf\n",e2.salary);
}
//3. Admin (id, name, salary, allowance)
#include<stdio.h>
#include<string.h>
struct Admin
{
	int id;
	char name[20];
	double salary;
	double allowance;
};

void main()
{
	struct Admin a1,a2;
	a1.id=101;
	strcpy(a1.name,"Pinkman");
	a1.salary=20000;
	a1.allowance=4000;

    printf("Enter Admin 2 details\n");
    printf("Enter id\n");
    scanf("%d",&a2.id);
    
    printf("Enter Name\n");
    scanf("%s",a2.name);
    
    printf("Enter salary\n");
    scanf("%lf",&a2.salary);
    
    printf("Enter allowance\n");
    scanf("%lf",&a2.allowance);
    
    printf("Admin 1 details\n");
    printf("id        =%d\n",a1.id);
    printf("name      =%s\n",a1.name);
    printf("salary    =%lf\n",a1.salary);
    printf("allowance =%lf\n",a1.allowance);
    
    printf("Admin 2 details\n");
    printf("id        =%d\n",a2.id);
    printf("name      =%s\n",a2.name);
    printf("salary    =%lf\n",a2.salary);
    printf("allowance =%lf\n",a2.allowance);
    
}
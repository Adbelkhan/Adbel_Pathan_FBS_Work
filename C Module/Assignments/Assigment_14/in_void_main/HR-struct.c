//4. HR (id, name, salary, commission)

#include<stdio.h>
#include<string.h>
typedef struct HR
{
	int id;
	char name[20];
	double salary;
	double commision;
}HR;

void main()
{
	HR h1,h2;
	
	h1.id=101;
	strcpy(h1.name,"mike");
	h1.salary=20000;
	h1.commision=1000;
	
	printf("Enter Hr 2 details\n");
	
	printf("Enter id\n");
	scanf("%d",&h2.id);
	
	printf("Enter name\n");
	scanf("%s",h2.name);
	
	printf("Enter salary\n");
	scanf("%lf",&h2.salary);
	
	printf("Enter commision\n");
	scanf("%lf",&h2.commision);
	
	printf("Hr 1 details\n");
	
	printf("id        =%d\n",h1.id);
	printf("name      =%s\n",h1.name);
	printf("salary    =%lf\n",h1.salary);
	printf("commision =%lf\n",h1.commision);
	
	printf("Hr 2 details\n");
	
	printf("id        =%d\n",h2.id);
	printf("name      =%s\n",h2.name);
	printf("salary    =%lf\n",h2.salary);
	printf("commision =%lf\n",h2.commision);
	
	
}
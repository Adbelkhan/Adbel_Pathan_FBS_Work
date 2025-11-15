#include<stdio.h>
#include<string.h>
struct Student
{
	int rollno;
	char name[20];
	int marks;
};

void main()
{
	struct Student s1, s2;
	s1.rollno=101;
	strcpy(s1.name,"white");
	s1.marks=75;
	
	printf("Enter rollno\n");
	scanf("%d",&s2.rollno);
	
	printf("Enter name\n");
	scanf("%s",s2.name);
	
	printf("Enter Marks\n");
	scanf("%d",&s2.marks);
	
	printf("Student 1 details\n");
	printf("Rollno = %d\n",s1.rollno);
	printf("Name   = %s\n",s1.name);
	printf("Marks  = %d\n",s1.marks);
	
	printf("Student 2 details\n");
	printf("Rollno = %d\n",s2.rollno);
	printf("Name   = %s\n",s2.name);
	printf("Marks  = %d\n",s2.marks);
}
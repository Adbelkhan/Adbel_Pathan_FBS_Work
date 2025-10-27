#include<stdio.h>

void twoNumbers(int* ch);

void main()
{
	int  ch ;
	printf("Enter char \n");
    scanf("%d",&ch);
    
	twoNumbers(&ch);
}

void twoNumbers(int* ch)
{
      
    int a =10, b =2;
	
	if(*ch==1)
		printf("Addition %d and %d is :%d",a,b ,a+b);
	else if(*ch==2)
	   	printf("Substraction of %d and %d is :%d",a,b,a-b);
	   else if(*ch==3)
	   	printf("Div of %d and %d is :%d",a,b,a/b);
	   else if(*ch==4)
	   	printf("Mul of %d and %d is :%d",a,b,a*b);
	   else if(*ch==5)
	   	printf("Mod of %d and %d is :%d",a,b,a%b);
	   else
	   printf("invalid");
}
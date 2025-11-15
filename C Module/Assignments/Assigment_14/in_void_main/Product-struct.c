//10. Product (id, name, quantity, price)
#include<stdio.h>
#include<string.h>
typedef struct Product
{
	int id; 
	char name[20];
	int quantity;
	int price;
}Product;
void main()
{
	Product p1,p2;
	p1.id=101;
	strcpy(p1.name,"laptop");
	p1.quantity=10;
	p1.price=1000;
	
	printf("Enter p2 details\n");
	printf("Enter p2 id\n");
	scanf("%d",&p2.id);
	
	printf("Enter p2 name\n");
	scanf("%s",p2.name);
	
	printf("Enter p2 quantity\n");
	scanf("%d",&p2.quantity);
	
	printf("Enter p2 price\n");
	scanf("%d",&p2.price);
	
	printf("Product 1 details\n");
	printf("id       =%d\n",p1.id);
	printf("name     =%s\n",p1.name);
	printf("quantity =%d\n",p1.quantity);
	printf("price    =%d\n",p1.price);
	
	printf("Product 2 details\n");
	printf("id       =%d\n",p2.id);
	printf("name     =%s\n",p2.name);
	printf("quantity =%d\n",p2.quantity);
	printf("price    =%d\n",p2.price);
	
}
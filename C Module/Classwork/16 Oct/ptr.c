#include <stdio.h>

void main()
{
	int a=10;
	printf("\nAddress of a %u", &a);
	printf("\nValue in a %d",a);
	
	int* ptr=&a;
	printf("\nAddress in ptr %u", ptr);
	printf("\nValue at Address in ptr %d", *ptr);
	
		printf("\nAddress of ptr %u", &ptr);
		
			printf("\nSize of ptr %u", sizeof(ptr));
	
}
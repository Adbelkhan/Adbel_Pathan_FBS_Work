#include<stdio.h>
void vowel(char ch);
 
void main()
{
	char ch ;
	printf("Enter char \n");
	scanf("%c", &ch);
	
	vowel(ch);
}

void vowel(char ch)
{
	
	if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
	printf("The char is vowel");
	else
	printf("Not vowel");
}
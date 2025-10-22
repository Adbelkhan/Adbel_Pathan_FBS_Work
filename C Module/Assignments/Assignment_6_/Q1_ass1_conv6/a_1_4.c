#include<stdio.h>

void vowelConsonant();

void main()
{
	vowelConsonant();
}

void vowelConsonant()
{
	char ch;
	
	printf("Enter Char \n");
	scanf("%c",& ch);
	
	if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A' || ch=='E' ||
	   ch=='I'|| ch=='O'|| ch=='U'){
		printf("The char is vowel");
	}
	else{
		printf("The char is consonant");
	}
}
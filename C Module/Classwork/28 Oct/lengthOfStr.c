// length of str

#include<stdio.h>
#include<string.h>
//void main()
//{
//	char str[]="hello";
//	
//	int i=0, count=0;
//	while(str[i]!='\0')
//	{
//		count++;
//		i++;
//	}
//	
//	printf("length of string is %d ",count);
//	
//}

int mystrlen(char *str);
void main()
{
	char str[]="hello";
	int len =mystrlen(str);
	
	printf("lengthe of string is %d",len);
}

int mystrlen(char *str)
{
		int i=0;
		while(str[i]!='\0')
		{
			i++;
		}
		return i;
}
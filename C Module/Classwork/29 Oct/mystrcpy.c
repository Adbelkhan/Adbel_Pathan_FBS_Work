// copy 

char*  mystrcpy(char *, char *);
void main()
{
	char str[]="hello";
	char dest[11];
	
//	printf("Enter string\n");
//	scanf("%s",str);
	
	char* res = mystrcpy(dest,str);
	printf("After copy the string %s",res);
	
}

char* mystrcpy(char *dest, char *str)
{
	char res;
	int i=0;
    while(str[i]!='\0')
    {
	   dest[i]=str[i];
	   i++;
    }
    dest[i]='\0';
	return dest;   

}





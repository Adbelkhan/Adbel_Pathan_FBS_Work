#include<stdio.h>

void pallindrome();

  void main()
  {
  	pallindrome();
  }
  
  void pallindrome()
  {
  	int no;
  	
  	printf("Enter the no \n");
	scanf("%d", &no);
	
	int temp=no, rem, rev=0;
	
	while(no>0)
	{
		rem= no%10;
		rev= rev*10+rem;
		no= no/10;
	}
	  if(rev==temp)
	  printf("%d is Pallindrome", rev);
	  else
	  printf("%d is Not Pallindrome", rev);
  }
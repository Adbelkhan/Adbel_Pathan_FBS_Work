// test 4 Qn 1 print factors of given range 10 to 15  
#include <stdio.h>
void main()
{
	int start, end;
	printf("Enter startNo endNo\n");
	scanf("%d %d",&start,&end);
	
	for(int k=start; k<=end; k++)
	{
		   int no=k;
		   
		      printf("The factors of number %d = ", no);
		   for(int i=1; i<=no; i++)
	    	{
			  if(no%i==0)
		        printf(" %d ",i);
		    }
		    
		    printf("\n");
	
		
	}
}
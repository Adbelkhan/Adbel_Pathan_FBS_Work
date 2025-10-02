//no is palindrom or not 
//void main(){
//	int no = 732;
//	int r1,r2,r3,rev;
//	int q1;
//	r1 = no%10;
//	q1 = r1/10;
//	r2 = q1%10;
//	r3 = q1/10;
//	rev = r1*100+r2*10+r3;
//	if(rev==no){
//		printf("no is palindrom");
//	}
//	else{
//		printf("no is not palindrom");
//	}
//}

// if(no%10==no/100)

void main(){
	int no =732;
	if(no%10==no/10){
		printf("no is pallindrome");
	}
	else{
		printf("no is not pallindrome");
	}
}
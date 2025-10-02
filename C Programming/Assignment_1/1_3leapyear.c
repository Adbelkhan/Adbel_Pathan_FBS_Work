//Write a program to check whether a given year is a leap year.
void main(){
	int year = 1999;
	if(year%4==0 && year%100!=0 || year%400==0){
		printf("Leap year");
	}
	else{
		printf("Not Leap year");
	}
}
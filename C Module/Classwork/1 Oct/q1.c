// q1 convert the time entered in hh , min and sec into total seconds

void main()
{
	int hh=1;
	int min = 30;
	int sec = 15;
	int time1, time2, time3 , total;
    time1 = hh*60*60;
	time2 = min*60;
	time3 = sec;
	
	total = time1+time2+time3;
	
	printf("The total seconds is: %d", total);
}
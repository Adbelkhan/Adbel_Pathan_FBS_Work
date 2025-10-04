//convert the time entered in time hh , min and sec into total sec

void main()
{
	int hh = 1 , min= 30 , sec=15;
	int totalsec;
	
    hh = 1*60*60;
	min = 30*60;
	sec = 15;
	
	totalsec= hh+min+sec;
	printf("Total seconds : %d", totalsec);
}
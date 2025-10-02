void main(){
	char ch = 'b';
	if(ch>='A' && ch<='Z'){
		ch = ch+32;
	}
	else{
		ch = ch-32;
	}
	printf("%d",ch);
}
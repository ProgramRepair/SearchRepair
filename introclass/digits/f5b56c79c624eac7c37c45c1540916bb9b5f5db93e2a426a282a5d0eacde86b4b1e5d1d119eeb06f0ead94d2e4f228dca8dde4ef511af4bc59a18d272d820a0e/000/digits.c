//
#include <stdio.h>
long long int check(long long int a, long long int b);

int main(){
	long long int in,num,digit,temp;
	int a=0;
	printf("\nEnter an ingteger > ");
	scanf("%lld",&in);
	if(in >0){
		num=10;
		while (a <=11){
		digit = in%num;
		digit = check(digit,(num/10));
		if(digit==in){
		break;
		}
		
		printf("%lld\n",digit);
		num = num*10;
		a++;
	}}
	else if(in == 0){
	printf("0\n");
	}
	else{
		num=(-10);
		while( a<=11){
		digit = in%(num);
		digit = check((-digit),(num/10));
		digit = digit *(-1);
		num=num*10;
		a++;
		temp = in%num;
		temp = check((-temp),(num/10));
		temp = temp *(-1);
		if(digit == 0){
		break;
		}
		if(temp == 0){
		printf("-%lld\n",digit);
		}
		else{
		printf("%lld\n",digit);
		}
	}}
	printf("That's all, have a nice day!\n");
	return 0;
}

long long int check(long long int a, long long int b){
	if(a >= b){
	a = a/b;
	return a;
	}
	else{
	return a;
	}
}

//
//
#include <stdio.h>

int main(void){
	int n,input, digit, inter, lastdigit;
	printf("Enter an integer > ");
	scanf("%d", &input);
	lastdigit=0;
	for(n=10;n<10000000001;n=n*10){
		digit=input%n;
		inter=digit;
		inter=inter-lastdigit;
		if (input<0 && !(input==digit))
			printf("%d\n", -inter*10/n);
		if (input <0 && input==digit)
			printf("%d\n", inter*10/n);
		if (input>0)
			printf("%d\n", inter*10/n);
		if (input==digit)
			break;
		lastdigit=digit;
	}
	printf("That's all, have a nice day!\n");
	return(0);
}

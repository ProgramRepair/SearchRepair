/**/

#include<stdio.h>
#include<stdlib.h>

int main(void){
	int value,digit;
	printf("\nEnter an integer > ");
	scanf("%d",&value);
	printf("\n");
	if (value > 0) {
		while (value!=0){
			digit=value%10;
			value=value/10;
			printf("%d\n",digit);
		}
	}
	if (value < 0) {
		value=abs(value);
		while (value>10){
			digit=value%10;
			value=value/10;
			printf("%d\n",digit);
		}
		digit=value%10;
		printf("-%d\n",digit);
	}
	if (value== 0){
		digit=value;
		printf("%d\n",digit);
	}		
	printf("That's all, have a nice day!\n");
	return(0);
}

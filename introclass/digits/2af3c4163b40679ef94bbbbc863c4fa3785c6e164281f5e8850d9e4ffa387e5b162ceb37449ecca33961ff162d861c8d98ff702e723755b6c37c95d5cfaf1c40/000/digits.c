/**/

#include<stdio.h>

int main(void){

	int num, digit;
	printf("Enter an integer > ");
	scanf("%d", &num);
	printf("\n");
	while (num > 0){
		digit = num % 10;
		printf("%d\n", digit);
		num = num/10;}
	printf("That's all, have a nice day!\n");
	return 0;}

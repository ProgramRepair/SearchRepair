//
//


#include <stdio.h>
#include <math.h>
#include <stdlib.h>
	

int main(void) {

	int number, rem;
	
	printf("\nEnter an integer > ");
	scanf("%d", &number);
	printf("\n");
	if (number < 0) {
		number = abs(number);
		while (number > 10) {
			rem = number % 10;
			printf("%d\n", rem);
			number = (number - rem)/10; }
		
		number = number - 2*number;
		printf("%d\nThat's all, have a nice day!\n", number);
	}
	else	{
		while (number != 0) {
			rem = number % 10;
			printf("%d\n", rem);
			number = (number - rem)/10; }
		printf("That's all, have a nice day!\n");

	}
	return (0);
} 

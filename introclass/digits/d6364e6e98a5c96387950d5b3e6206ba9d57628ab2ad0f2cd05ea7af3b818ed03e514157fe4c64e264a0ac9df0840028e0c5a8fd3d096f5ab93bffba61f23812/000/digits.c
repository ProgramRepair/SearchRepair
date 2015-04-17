/**/

#include <stdio.h>

int main() {
	//
	int input, display;
	//
	printf("Enter an integer > ");
	scanf("%d", &input);
	printf("\n");
	if (input < 0) {
		input=input*(-1);
		while ((input/10) >= 1) {//
			display=input%10;
			printf("%d\n", display);
			input=input/10; 
		}
		printf("-%d\n", input%10);
		printf("That's all, have a nice day!\n");
		return 0;
	}
	while ((input%10) >= 1) {
		display=input%10;
		printf("%d\n", display);
		input=input/10; 
	}
	printf("That's all, have a nice day!\n");
	return 0;
}


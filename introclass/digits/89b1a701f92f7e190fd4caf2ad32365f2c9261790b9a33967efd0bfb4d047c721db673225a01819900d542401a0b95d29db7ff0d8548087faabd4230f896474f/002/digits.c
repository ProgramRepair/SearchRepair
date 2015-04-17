/**/
#include <stdio.h>
#include <math.h>
#include <stdlib.h>
int find_length(int x) {
	int length;
	length = 0;
	while (x != 0) {
		x /= 10;
		length += 1;
	}
	return(length);
	
}
		

int main() {
	int n, length, digits;
	printf("\nEnter an integer > ");
	scanf("%d", &n);
	length = find_length(n);
	while (length != 0) {
		if (n<0 && length != 1)
			digits = abs(n) % 10;
		else
			digits = n % 10;
		n = n / 10;
		length = length - 1;
		printf("%d\n", digits);
		}
	printf("That's all, have a nice day!\n");

	return 0;
}
	

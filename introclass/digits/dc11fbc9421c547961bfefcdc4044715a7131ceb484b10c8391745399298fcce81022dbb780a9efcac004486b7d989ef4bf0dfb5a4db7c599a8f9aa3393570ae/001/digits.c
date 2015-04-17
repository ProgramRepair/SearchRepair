/**/

#include <stdio.h>
#include <math.h>

int main() {

	int n;
	int d[9];
	int negative = 0;

	printf("Enter an integer > ");
	scanf("%d", &n);

	int size = 0;
	
	//
	while(abs(n) >= pow(10, size)) {
		size++;
	}

	//
	if(n < 0) negative = 1;	

	//
	int i;
	for(i = 0; i < 10; i++) {
		int remainder = n % (int) pow(10, i + 1);
		int multiplier = pow(10, i);
		d[i] = remainder / multiplier;
		n -= remainder;
	}
	
	if(negative) {
		for(i = 0; i < size - 1; i++) {
			printf("%d\n", d[i] * -1);
		}
		printf("%d\n", d[size - 1]);
	}
	else for(i = 0; i < size; i++) {
		printf("%d\n", d[i]);
	}
	printf("That's all, have a nice day!\n");
	

return 0;
}

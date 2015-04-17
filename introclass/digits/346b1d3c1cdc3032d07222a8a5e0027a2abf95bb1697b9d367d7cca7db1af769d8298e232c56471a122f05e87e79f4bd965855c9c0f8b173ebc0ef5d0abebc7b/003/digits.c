/**/

#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int main(void){
	int n, rem, digit, new, x;
	printf("\nEnter an integer > ");
	scanf("%d", &x);
	for (n = x; n > 0; n = n/10){	
		digit = (n%10);
		printf("\n%d",digit);
		//**/
	}
//
	for  (n = x; n < 0; n = n/10){
		new = n%10;	
		digit = abs(new);
		rem = abs(n);
		if (rem >= 10) {
			printf("\n%d",digit);
		}
		if (rem < 10)  {
			printf("\n-%d",rem);
		}
		//**/
	}
	printf("\nThat's all, have a nice day!\n");
	
	
	return 0;
}

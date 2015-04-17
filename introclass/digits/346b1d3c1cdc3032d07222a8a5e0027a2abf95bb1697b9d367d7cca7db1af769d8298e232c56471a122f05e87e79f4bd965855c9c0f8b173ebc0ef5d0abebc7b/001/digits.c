/**/

#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int main(void){
	int n, rem, digit, new, x;
	printf("Please enter an integer ");
	scanf("%d", &x);
	for (n = x; n > 0; n = n/10){	
		digit = (n%10);
		printf("%d\n",digit);
		//**/
	}
	for  (n = x; n < 0; n = n/10){
		new = n%10;	
		digit = abs(new);
		rem = abs(n);
		if (rem >= 10) {
			printf("%d\n",digit);
		}
		if (rem < 10)  {
			printf("-%d\n",rem);
		}
		//**/
	}

	
	
	return 0;
}

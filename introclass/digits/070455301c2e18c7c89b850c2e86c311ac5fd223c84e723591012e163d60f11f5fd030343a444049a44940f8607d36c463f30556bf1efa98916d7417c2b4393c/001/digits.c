/**/

#include <stdio.h>
#include <math.h>


int main() {
	int n, r, nn;
	
	printf("\nEnter an integer > ");
	scanf("%d", &n);
	while( n > 0 ){
		r = n % 10;
		nn= n / 10;
		n= nn;
		
		printf("\n%d", r);
		
	}
	printf("\nThat's all, have a nice day!\n");
	
	return 0;
	
}
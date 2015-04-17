/**/

#include<stdio.h>
#include<math.h>

int
main(void){
	float a, b, c, d;
	
	printf("Please enter 4 numbers separated by spaces > ");
	scanf("%f %f %f %f", &a, &b, &c, &d);

	if((a < b) && (a < c) && (a < d))
		printf("%.0f is the smallest\n", a);
	else if ((b < a) && (b < c) && (b < d))
		printf("%.0f is the smallest\n", b);
	else if ((c < a) && (c < b) && (c < d))
		printf("%.0f is the smallest\n", c);
	else printf("%.0f is the smallest\n", d);

	return(0);
}

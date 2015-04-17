/**/

#include <stdio.h>
#include <math.h>


int main() {

	int a, b, c, d, num_1, num_2, num_3, num_4;
	printf("Please enter 4 numbers seperated by spaces > ");
	scanf("%d%d%d%d", &num_1, &num_2, &num_3, &num_4);
	a = (num_1);
	b = (num_2);
	c = (num_3);
	d = (num_4); 
	
	if (a<b && a<c && a<d)
		printf("%d is the smallest\n",a);
	else if (b<a && b<c && b<d)
		printf("%d is the smalles\n",b);
	else if (c<a && c<b && c<d)
		printf("%d is the smallest\n",c);
	else if (d<a && d<b && d<c)
		printf("%d is the smallest\n",d);
	return 0;


}

/**/

#include <stdio.h>
#include <math.h>

int
main(void)
{
	double first, second, third;

	printf("Please enter 3 numbers seperated by spaces > ");
	scanf("%lf", &first);
	scanf("%lf", &second);
	scanf("%lf", &third);

	if ((first>second && first<third) || (first<second && first>third))
		printf("%.0lf is the median\n",first);
	if ((second>first && second<third) || (second<first && second>third))
		printf("%.0lf is the median\n",second);
	if ((third>first && third<second) || (third<first && third>second))
		printf("%.0lf is the median\n", third);
	return(0);
}

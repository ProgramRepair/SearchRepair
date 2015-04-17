/**/
#include <stdio.h>
#include <math.h>

int main ()
{

double a, b, c, d; //**/

printf("Please enter 4 numbers separated by spaces > ");
scanf("%lf%lf%lf%lf", &a, &b, &c, &d);

if (a < b && a < c && a < d)
	printf("%.0f is the smallest\n", a);
else if (b < a && b < c && b < d)
	printf("%.0f is the smallest\n", b);
else if (c < b && c < a && c < d)
	printf("%.0f is the smallest\n", c);
else if (d < b && d < c && d < a)
	printf("%.0f is the smallest\n", d);
	
return 0;

}
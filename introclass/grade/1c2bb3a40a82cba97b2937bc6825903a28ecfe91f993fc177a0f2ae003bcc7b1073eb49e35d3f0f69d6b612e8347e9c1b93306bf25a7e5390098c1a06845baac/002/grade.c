/**/

#include <stdio.h>
#include <math.h>

int
main(void)
{

double a, b ,c, d, e;

printf("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > Thank you. ");
scanf("%lf %lf %lf %lf", &a, &b, &c, &d);

printf("Now enter student score (percent) >");
scanf("%lf", &e);

if (e >= a)
	printf("Student has an A grade\n");

else if (e >= b)
	printf("Student has an B grade\n");

else if (e >= c)
	printf("Student has an C grade\n");

else if (e >= d) 
	printf("Student has an D grade\n");
else
	printf("Student has an F grade\n");

return(0);
}

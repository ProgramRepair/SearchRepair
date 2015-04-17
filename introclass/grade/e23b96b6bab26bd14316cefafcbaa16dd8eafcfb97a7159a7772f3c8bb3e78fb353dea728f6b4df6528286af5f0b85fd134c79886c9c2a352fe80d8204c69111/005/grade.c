/**/

#include <stdio.h>
#include <math.h>

int main (void){

	float a, b, c, d;
	float percent;

	printf("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > ");
	scanf("%f%f%f%f", &a, &b, &c, &d);
	printf("Thank you. Now enter student score (percent) >");
	scanf("%f", &percent);

	if (percent >= a)
		printf("Student has an A grade\n");
	else if (percent<=a && percent>=b)
		printf("Student has an B grade\n");
	else if (percent<b && percent>=c)
		printf("Student has an C grade\n");
	else if (percent<c && percent>=d)
		printf("Student has an D grade\n");
	else if (percent<d)
		printf("Student has failed that course\n");

return 0;

}

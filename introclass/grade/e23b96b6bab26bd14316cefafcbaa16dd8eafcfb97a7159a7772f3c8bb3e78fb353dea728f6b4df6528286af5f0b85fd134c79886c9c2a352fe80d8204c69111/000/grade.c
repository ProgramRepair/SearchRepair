/**/

#include <stdio.h>
#include <math.h>

int main (void){

	float a, b, c, d;
	float score;

	printf("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > ");
	scanf("%f%f%f%f", &a, &b, &c, &d);
	printf("Thank you. Now enter student score (percent) >");
	scanf("%f", &score);

	if (score > a)
		printf("Student has an A grade\n");
	else if (score <= a && score >= b)
		printf("Student has an B grade\n");
	else if (score <= b && score >= c)
		printf("Student has an C grade\n");
	else if (score <= c && score >= d)
		printf("Student has an D grade\n");
	else printf("Student has failed that course\n");

	return 0;

}

//
#include <stdio.h>

int
main(void)
{
	float a, b, c, d, score;
	printf("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > ");
	scanf("%f%f%f%f", &a, &b, &c, &d);
	printf("Thank you. Now enter student score (percent) >");
	scanf("%f", &score);
	if (score >= a)
	printf("Student has a A grade\n");
	if (score >= b && score < a)
	printf("Student has a B grade\n");
	if (score >= c && score < b)
	printf("Student has a C grade\n");
	if (score >= d && score < c)
	printf("Student has a D grade\n");
	if (score < d)
	printf("Student has failed the course\n");

return(0);
}

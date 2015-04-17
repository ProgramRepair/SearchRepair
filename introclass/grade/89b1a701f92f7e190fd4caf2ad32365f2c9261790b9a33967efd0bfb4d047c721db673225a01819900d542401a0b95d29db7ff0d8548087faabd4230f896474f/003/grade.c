/**/
#include <stdio.h>
int main() {
	float a, b, c, d, p;
	printf("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > ");
	scanf("%f %f %f %f", &a, &b, &c, &d);
	printf("Thank you. Now enter student score (percent) > ");
	scanf("%f", &p);
	if (p>=a)
		printf("Student has an A grade");
	if (p<a && p>=b)
		printf("Student has an B grade");
	if (p<b && p>=c)
		printf("Student has an C grade");
	if (p<c && p>=d)
		printf("Student has an D grade");
	if (p<d) 
		printf("Student has an F grade");
	printf("\n");
	return 0;
}

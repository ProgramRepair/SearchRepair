//
//
#include <stdio.h>

int main (void) {
	float a, b, c, d, grade;
	printf("Enter thresholds for A, B, C, D\n");
	printf("in that order, decreasing percentages > ");
	scanf("%f%f%f%f", &a, &b, &c, &d);
	printf("Thank you. Now enter student score (percent) >");
	scanf("%f", &grade);
	if (grade>=a)
		printf("Student has an A grade\n");
	else if (grade>=b)
                printf("Student has an B grade\n");
	else if (grade>=c)
                printf("Student has an C grade\n");
	else if (grade>=d)
                printf("Student has an D grade\n");
	else
		printf("Student has an F grade\n");

	return(0);
}

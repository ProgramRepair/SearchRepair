//

#include <stdio.h>

int main() {
	float A, B, C, D, S;
	printf("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > ");
	scanf("%f %f %f %f", &A, &B, &C, &D);
	printf("Thank you. Now enter student score (percent) >");
	scanf("%f", &S);
	if (S >= A)
	printf("Student has an A grade\n");
	if (S >= B && S < A)
	printf("Student has an B grade\n");
	if (S >= C && S < B)
	printf("Student has an C grade\n");
	if (S >= D && S < C)
	printf("Student has an D grade\n");
	if (S < D)
	printf("Student has an F grade\n");
	return 0;
}

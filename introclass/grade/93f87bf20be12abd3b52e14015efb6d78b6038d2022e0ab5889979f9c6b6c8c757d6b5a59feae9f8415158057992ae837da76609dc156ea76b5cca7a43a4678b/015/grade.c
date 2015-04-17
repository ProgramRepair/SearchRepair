/**/
#include <stdio.h>
#include <math.h>
int main (void)
{
	float score, A, B, C, D;
	printf("Enter thresholds for A, B, C, D \n in that order, decreasing percentages > ");
	scanf("%f %f %f %f", &A, &B, &C, &D);
	printf("Thank you. Now enter student score (percent) > ");
	scanf("%f", &score);
	if ((score >= (A)))
	printf("Student has an A grade\n");
	else if ((score >= (B)) && (score < (A)))
	printf("Student has an B grade\n");
	else if ((score >= (C)) && (score < (B)))
        printf("Student has an C grade\n");
	else if ((score >= (D)) && (score < (C)))
        printf("Student has an D grade\n");
	else if((score < (D)))
        printf("Student has an F grade\n");
	return 0;
}




/**/

#include <stdio.h>


int main(void) {
	float A, B, C, D, percent;
	printf("Enter thresholds for A, B, C, D\n");
	printf("in that order, decreasing percentages > ");
	scanf("%f%f%f%f", &A, &B, &C, &D);
	printf("Thank you. Now enter student score (percent) >");
	scanf("%f", &percent);
	
	if (percent >= A)
		printf("Student has an A grade\n");
	else if (percent >= B)
		printf("Student has an B grade\n");
	else if (percent >= C)
		printf("Student has an C grade\n");
	else if (percent >= D)
		printf("Student has an D grade\n");
	else 
		printf("Student has an F grade\n");	
		

	return (0);
}
/**/

#include <stdio.h>

int main() {
	float A,B,C,D,Std;
	printf("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > ");
	scanf("%f%f%f%f", &A, &B, &C, &D);
	printf("Thank you. Now enter student score (percent) >");
	scanf("%f", &Std);
	if (Std >= A) {
		printf("Student has an A grade\n");
		return 0;
	}
	else if (Std >= B) {
		printf("Student has an B grade\n");
		return 0;
	}
	else if (Std >= C) {
		printf("Student has an C grade\n");
		return 0;
	}
	else if (Std >= D) {
		printf("Student has a D grade\n");
		return 0;
	}
	else if (Std < D) {
		printf("Student has failed the course\n");
		return 0;
	}
	else {
		printf("Program did not understand that grade, please try again and remember to enter a percentage\n");
		return 666;
	}
}


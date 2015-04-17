/**/ 

#include<stdio.h>

int main(void) {
	
	float a, b, c, d, A;

	printf("Enter thresholds for A, B, C, D\nin that order, decreasing percentages  > ");
	scanf("%f %f %f %f",&a,&b,&c,&d);

	printf("Thank you. Now enter student score (percent) >");
	scanf("%f",&A);

	if (A >= a){
		printf("Student has an A grade\n");
	}
	else if (A < a && A >= b){
		printf("Student has an B grade\n");
	}
	else if (A < b && A >= c) {
		printf("Student has an C grade\n");
	}
	else if (A < c && A >= d) {
		printf("Student has an D grade\n");
	}
	else
		printf("Student has an F grade\n");
	return 0;

} 


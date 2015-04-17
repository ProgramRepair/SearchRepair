/**/

#include <stdio.h>

int main () {
	
	double A, B, C, D, //**/
		   score;	   //**/
	
	printf("Enter thresholds for A, B, C, D\n");
	printf("in that order, decreasing percentages > ");
		scanf("%lf%lf%lf%lf", &A, &B, &C, &D);
	printf("\nThank you. Now enter student score (percent) >");
		scanf("%lf", &score);
	
	if (score >= A) {
		printf("Student has an A grade\n");
		}
	else if (score >= B) {
		printf("Student has an B grade\n");
		}
	else if (score >= C) {
		printf("Student has an C grade\n");
		}
	else if (score < D) {
		printf("Student has failed the course\n");
		}
	
	return 0;
	
}

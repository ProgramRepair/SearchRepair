/**/
#include <stdio.h>
int main(){
	float score, A, B, C, D;
	printf("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > ");
	scanf("%f%f%f%f", &A, &B, &C, &D);
	printf("Thank you. Now enter student score (percent) >");
	scanf("%f", &score);
	if (score >= A){
		printf("Student has an A grade\n");
	}
	else if (score < A && score >= B){
		printf("Student has an B grade\n");
	}
	else if (score < B && score >= C){
		printf("Student has and C grade\n");
	}
	else if (score < C && score >= D){
		printf("Student has an D grade\n");
	}
	else
	{
		printf("Student has failed the course\n");
	}
	return 0;

}

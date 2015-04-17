/**/

#include <stdio.h>

int main() {
	double a, b, c, d;
	double score;

	printf("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > ");
	scanf("%lf %lf %lf %lf", &a,&b,&c,&d);
	
	printf("Thank you. Now enter student score (percent) >");
	scanf("%lf", &score);

	if(score >= a) printf("Student has an A grade\n");
	else if(score >= b) printf("Student has a B grade\n");
	else if(score >= c) printf("Student has a C grade\n");
	else if(score >= d) printf("Student has a D grade\n");
	else  printf("Student has failed the course\n");

return 0;

} 

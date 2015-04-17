/**/

#include <stdio.h>
#include <math.h>

int main()
{
	double a, b, c, d;
	double score;
	char grade;
	printf("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > ");
	scanf("%lf%lf%lf%lf", &a, &b, &c, &d);
	printf("Thank you.  Now enter student score (percent) >");
	scanf("%lf", &score);
	if(score>=a)
	grade='A';
	else if(score>=b)
	grade='B';
	else if(score>=c)
	grade='C';
	else if(score>=d)
	grade='D';
	else grade='F';
	printf("Student has an %c grade\n", grade);
	return 0;
}

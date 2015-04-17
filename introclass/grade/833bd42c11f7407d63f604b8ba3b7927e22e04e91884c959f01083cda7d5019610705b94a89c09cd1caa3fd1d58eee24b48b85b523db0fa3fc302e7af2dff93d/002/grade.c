/**/

#include <stdio.h>

int
main(void)
{
double grade_a, grade_b, grade_c, grade_d, student_score;

printf("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > ");
scanf("%lf%lf%lf%lf",&grade_a, &grade_b, &grade_c, &grade_d);

printf("Thank you. Now enter student score (percent) >");
scanf("%lf",&student_score);

if (student_score >= grade_a) {
	printf("Student has an A grade\n");
}
else if (student_score >= grade_b) {
	printf("Student has an B grade\n");
}
else if (student_score >= grade_c) {
	printf("Student has an C grade\n");
}
else if (student_score >= grade_d) {
	printf("Student has an D grade\n");
}
else {printf("Student has an F grade\n");}

return 0;

}

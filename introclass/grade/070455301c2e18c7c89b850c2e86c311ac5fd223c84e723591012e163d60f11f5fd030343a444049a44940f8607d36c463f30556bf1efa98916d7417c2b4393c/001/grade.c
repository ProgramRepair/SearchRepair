/**/

#include <stdio.h>
#include <math.h>

int main() {

	float a, b, c, d, score;
	char grade;
		
	printf("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > ");
	scanf("%f%f%f%f", &a, &b, &c, &d);
	printf("Thank you. Now enter student score (percent) > ");
	scanf("%f", &score);
	if (score >= a)
		grade= 'A';
	else if ((score >= b) && (score < a))
		grade= 'B';
	else if ((score >= c) && (score < b))
		grade= 'C';
	else if ((score >= d) && (score < c))
		grade= 'D';
	
	printf("Student has an %c grade\n", grade);
		
	return 0;
		
}
		
		
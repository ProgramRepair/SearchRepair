/**/
#include <stdio.h>
#include <math.h>

int main () {

	float A, B, C, D, score;

	printf("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > ");
	scanf("%f %f %f %f", &A, &B, &C, &D);
	
	printf("Thank you. Now enter student score (percent) > ");
	scanf("%f", &score);

	if(score>=A)
	  printf("Student has an A grade\n");
	else if(score>=B)
	  printf("Student has a B grade\n");
	else if(score>=C)
	  printf("Student has a C grade\n");
	else if(score>=D)
	  printf("Student has a D grade\n");
	else if(score<D)
	  printf("Student has failed the course\n");

	return 0;
}

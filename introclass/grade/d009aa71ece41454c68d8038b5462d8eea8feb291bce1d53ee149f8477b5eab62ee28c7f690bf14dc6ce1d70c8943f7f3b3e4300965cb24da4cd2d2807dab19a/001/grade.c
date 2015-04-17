/**/
#include <stdio.h>
#include <math.h>

int main () {

	float A, B, C, D, score;

	printf("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > ");
	scanf("%f%f%f%f", &A, &B, &C, &D);
	
	printf("Thank you. Now enter student score (percent) > ");
	scanf("%f", &score);

	if(score>=A)
	  printf("Student has an A grade\n");
	if((score<A)&&(score>=B))
	  printf("Student has a B grade\n");
	if((score<B)&&(score>=C))
	  printf("Student has a C grade\n");
	if((score<C)&&(score>=D))
	  printf("Student has a D grade\n");
	if(score<D)
	  printf("Student has failed the course\n");

	return 0;
}

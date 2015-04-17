/**/

#include <stdio.h>
#include <math.h>

int
main(void)
{
	float A, B, C, D,  avg;
	printf("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > ");
	scanf("%f", &A);
	scanf("%f", &B);
	scanf("%f", &C);
	scanf("%f", &D);
	printf("Thank you. Now enter student score (perrcent) >");
	scanf("%f", &avg);

	if (avg >= A)
		printf("Student has an A grade\n");
	if(avg >= B && avg< A)
		printf("Student has an B grade\n");
	if(avg >= C && avg < B)
		printf("Student has an C grade\n");
	if(avg >= D && avg<C){
	
		printf("Student has an D grade\n");
	}
	if (avg<D){
		printf("Student has an F grade\n");
	}
	return(0);
}

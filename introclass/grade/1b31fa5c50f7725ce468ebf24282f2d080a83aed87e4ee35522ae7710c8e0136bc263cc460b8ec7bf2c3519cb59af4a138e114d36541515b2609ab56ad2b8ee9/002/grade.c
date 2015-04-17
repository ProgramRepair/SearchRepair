/**/
#include <stdio.h>

int main()
{
	float A, B, C, D, grade;

	printf("Enter thresholds for A, B, C, D\n");
	printf("in that order, decreasing percentages > ");
	scanf("%f %f %f %f", &A, &B, &C, &D);
	printf("Thank you. Now enter student score (percent) >");
	scanf("%f", &grade);

	if(grade >= A)
	{
		printf("Student has an A grade\n");
		return 0;
	}

	else if((grade < A) && (grade >= B))
	{
                printf("Student has an B grade\n");
                return 0;
        }
	else if((grade < B) && (grade >= D))
	{
                printf("Student has an C grade\n");
                return 0;
        }
	else if((grade < C) && (grade >= D))
	{
                printf("Student has an D grade\n");
                return 0;
        }
	else printf("Student has failed the course\n");

	return 0;
}

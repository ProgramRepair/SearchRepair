/**/

#include <stdio.h>

int main () {
	float n1, n2, n3 ,n4;
	float perc;

	printf("Enter thresholds for A, B, C, D");
	printf("\nin that order, decreasing percentages > ");
	scanf("%f%f%f%f", &n1, &n2, &n3, &n4);
	
	printf("Thank you. Now enter student score (percent) >");
	scanf("%f", &perc);

	if(perc >= n1)
		printf("Student has an A grade\n");
	else if(perc >= n2 && perc < n1)
		printf("Student has a B grade\n");
	else if(perc >= n3 && perc < n2)
		printf("Student has a C grade\n");
	else if(perc >= n4 && perc < n3)
		printf("Student has a D grade\n");
	else if(perc < n4)
		printf("Student has failed the course\n");


	return 0;
}














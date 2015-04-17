/**/

#include<stdio.h>

int main(){

	double a,b,c,d,score;

	printf("Enter thresholds for A, B, C, D \nin that order, decreasing percentages > ");
	scanf("%lf %lf %lf %lf",&a,&b,&c,&d);

	printf("Thank you. Now enter student score (percent) >");
	scanf("%lf", &score);

	if (score >= a){
		printf("Student has an A grade\n");
	}
	else if ((score >= b) && (score > a)){
		printf("Student has an B grade\n");
	}
	else if ((score >= c) && (score < b)){
		printf("Student has an C grade\n");
	}
	else if ( (score >= d) && (score < c)){
		printf("Student has an D grade\n");
	}
	else if (score < d){
		printf("Student has failed the course\n");
	}

return 0;
}

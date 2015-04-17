/**/

#include<stdio.h>

int main(){

	float a,b,c,d,score;

	printf("Enter thresholds for A, B, C, D \nin that order, decreasing percentages > ");
	scanf("%f %f %f %f",&a,&b,&c,&d);

	printf("Thank you. Now enter student score (percent) >");
	scanf("%f", &score);

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

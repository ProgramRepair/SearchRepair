/**/

#include<stdio.h>

int main(){
	float grade,per1,per2,per3,per4;
	printf("Enter thresholds for A, B, C, D\n");
	printf("in that order, decreasing percentages > ");
	scanf("%f%f%f%f",&per1,&per2,&per3,&per4);
	printf("Thank you. Now enter student score (percent) >");
	scanf("%f",&grade);
	if (grade>=per1)
		printf("Student has an A grade\n");
	else if(grade>=per2)
		printf("Student has an B grade\n");
	else if(grade>=per3)
		printf("Studnet has an C grade\n");
	else if(grade>=per4)
		printf("Student has an D grade\n");
	else
		printf("Studnet has failed the course\n");
	return (0);
}

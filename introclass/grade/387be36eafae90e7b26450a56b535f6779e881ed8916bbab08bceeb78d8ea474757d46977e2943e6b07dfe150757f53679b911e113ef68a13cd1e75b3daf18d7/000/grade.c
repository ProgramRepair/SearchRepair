/**/
#include<stdio.h>

int main(){

	float A, B, C, D, grade;

	printf("Enter thresholds for A, B, C, D\nin that order decreasing percentages > ");
	scanf("%f %f %f %f", &A, &B, &C, &D);
	
	printf("Thank you. Now enter student score (percent) > ");
	scanf("%f", &grade);
	
	if(grade<D){
	printf("Student has an F grade\n");}
	else if(grade<C){
	printf("Student has a D grade\n");}
	else if(grade<B){
	printf("Student has a C grade\n");}
	else if(grade<A){
	printf("Student has a B grade\n");}
	else if(grade>=A){
	printf("Student has an A grade\n");}

return 0;

}

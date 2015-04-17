/**/


#include <stdio.h>
#include <math.h>

int main(void){

	double A, B, C, D, score;  
	
	printf("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > ");
	scanf("%lf %lf %lf %lf", &A, &B, &C, &D);
	
	printf("Thank you. Now enter student score (percent) > ");
	
	scanf("%lf", &score);
	
	if(score<D){
	printf("Student has an F grade\n");
	}
	
	else if(score>=D && score <C){
	 printf("Student has an D grade\n");
	 }
	else if(score>=C && score<B){
	  printf("Student has an C grade\n");
	  }
	else if(score>=B && score<A){
	 printf("Student has an B grade\n");
	 }
	else if(score>=A){
	 printf("Student has an A grade\n");
	 }
	 
return(0);
}
	  
	

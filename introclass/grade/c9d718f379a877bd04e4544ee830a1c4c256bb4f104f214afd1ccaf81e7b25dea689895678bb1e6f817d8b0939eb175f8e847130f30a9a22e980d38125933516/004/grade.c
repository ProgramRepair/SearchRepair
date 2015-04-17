/**/

#include<stdio.h>
#include<math.h>
int main(){
	float a,b,c,d,g;
	printf("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > ");
	scanf("%f%f%f%f",&a,&b,&c,&d);
	printf("Thank you. Now enter student score (percent) >");
	scanf("%f",&g);
	if (g>=a){
		printf("Student has an A grade\n");
	}
	else if(g>=b && g<a){
		printf("Student has an B grade\n");
	}
	else if(g>=c && g<b){
		printf("Studnet has an C grade\n");
	}
	else if(g>=d && g<c){
		printf("Student has an D grade\n");
	}
	else if (g<d){
		printf("Studnet has failed the course\n");
	}
	return (0);
}

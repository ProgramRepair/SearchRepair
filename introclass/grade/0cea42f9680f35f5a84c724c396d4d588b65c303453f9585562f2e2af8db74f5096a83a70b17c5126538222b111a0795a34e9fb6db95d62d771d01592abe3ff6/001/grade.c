//
#include <stdio.h>
int main(){
float A,B,C,D,score;
printf("Enter threshold for grades A, B, C, D\n");
printf("in this order, decreasing persentages > ");
scanf("%f%f%f%f",&A,&B,&C,&D);
printf("Thank you. Now enter student score (percent) > ");
scanf("%f",&score);
if(score >=A){
printf("Student has an A grade\n");}
else if(score<A && score>=B)
{printf("Student has a B grade\n");}
else if(score<B && score>=C){
printf("Student has a C grade\n");}
else if(score<C && score>=D)
{printf("Student has a D grade\n");}
else
{printf("Student has failed the course\n");
}
return 0;
}


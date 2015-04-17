/**/
#include <stdio.h>
#include <math.h>


int main(){

double A, B, C, D, studentscore;
char lettergrade;


printf("Enter thresholds for A, B, C, D in that order, decreasing percentages > Thank you. ");
scanf("%lf %lf %lf %lf", &A, &B, &C, &D);
printf("Now enter student score (perecnt) >");
scanf("%lf", &studentscore);
if(studentscore>=A)
lettergrade='A';
else if(studentscore>=B)
lettergrade='B';
else if(studentscore>=C)
lettergrade='C';
else
lettergrade='D';
printf("Student has an %c grade\n",lettergrade);

return(0);




}

/**/
#include <stdio.h>


int main(){

double A, B, C, D, studentscore;
char lettergrade;


printf("Enter thresholds for A, B, C, D \nin that order, decreasing percentages > Thank you. ");
scanf("%lf %lf %lf %lf", &A, &B, &C, &D);
printf("Now enter student score (perecnt) >");
scanf("%lf", &studentscore);
if(studentscore>=A)
lettergrade='A';
else if(studentscore>=B)
lettergrade='B';
else if(studentscore>=C)
lettergrade='C';
else if(studentscore>=D)
lettergrade='D';
else
lettergrade='F';
printf("Student has an %c grade\n",lettergrade);

return(0);




}

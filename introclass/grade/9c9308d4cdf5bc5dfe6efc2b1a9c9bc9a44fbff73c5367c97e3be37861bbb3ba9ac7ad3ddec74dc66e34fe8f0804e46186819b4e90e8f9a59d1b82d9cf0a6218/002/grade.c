/**/
#include <stdio.h>
#include <math.h>


int main(){

float A, B, C, D, studentscore;
char lettergrade;


printf("Enter thresholds for A, B, C, D in that order, decreasing percentages > Thank you. ");
scanf("%f %f %f %f", &A, &B, &C, &D);
printf("Now enter student score (perecnt) >");
scanf("%f", &studentscore);
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

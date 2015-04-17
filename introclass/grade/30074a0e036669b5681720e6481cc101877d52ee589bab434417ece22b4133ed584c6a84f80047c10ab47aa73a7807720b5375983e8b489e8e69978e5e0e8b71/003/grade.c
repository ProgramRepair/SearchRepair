/**/

#include <stdio.h>
#include <math.h>

int main () {

float A, B, C, D, Grade;

printf("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > ");
scanf("%f %f %f %f", &A, &B, &C, &D);
printf("Thank you. Now enter student score (percent) >");
scanf("%f", &Grade);
if(Grade >= A)
printf("the student has an A grade\n");
if(Grade >=B && Grade < A)
printf("the student has an B grade\n");
if(Grade >=C && Grade < B)
printf("the student has an C grade\n");
if(Grade < C && Grade >= D)
printf("the student has an D grade\n");
if (Grade < D)
printf("the student has an F grade\n");

return (0);

}




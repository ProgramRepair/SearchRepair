/**/
#include <stdio.h>
#include <math.h>

int main() {

float num1,num2,num3,num4; //**/
float score; //**/

printf("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > ");
scanf("%f%f%f%f",&num1,&num2,&num3,&num4);

printf("Thank you. Now enter student score (percent) >");
scanf("%f",&score);

if (score>=num1)
printf("Student has an A grade\n");
else if (score>=num2)
printf("Student has an B grade\n");
else if (score>=num3)
printf("Student has an C grade\n");
else if (score>=num4)
printf("Student has an D grade\n");
else
printf("Student has an F grade\n");



return 0;
}

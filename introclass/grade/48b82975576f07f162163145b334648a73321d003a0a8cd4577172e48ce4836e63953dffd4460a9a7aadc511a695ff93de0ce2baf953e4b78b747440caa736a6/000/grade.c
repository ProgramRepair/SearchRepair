/**/
#include <math.h>
#include <stdio.h>
int main(){
float a, b, c, d,e;
printf("Enter thresholds for A, B, C, D\nin that order, decreasing percentages >");
scanf("%f%f%f%f", &a,&b,&c,&d);
printf("Thank you. Now enter student score (percent) >");
scanf("%f",&e);
if (e>=a)
printf("Student has an A grade\n");
else if(e>=b)
printf("Student has an B grade\n");
else if (e>=c)
printf("Student has an C grade\n");
else if(e>=d)
printf("Student has an D grade\n");

return 0;
}

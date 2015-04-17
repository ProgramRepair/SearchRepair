/**/
//**/

#include <stdio.h>
#include <math.h>

int main() {

double a, b, c, d;
double per;

printf("Enter thresholds for A, B, C, D\n");
printf("in that order, decreasing percentages > ");
scanf("%lf""%lf""%lf""%lf", &a, &b, &c, &d);

per = (a+b+c+d)/4;

if(per<60)
printf("Thank you. Now enter student score (percent) >Student has an D grade\n");

else if (per>=60 && per<70)
printf("Thank you. Now enter student score (percent) >Studnet has an C grade\n");

else if (per>=70 && per<80)
printf("Thank you. Now enter student score (percent) >Student has an B grade\n");

else if (per>=80)
printf("Thank you. Now enter student score (percent) >Student ahs an A grade\n");

return(0);

}

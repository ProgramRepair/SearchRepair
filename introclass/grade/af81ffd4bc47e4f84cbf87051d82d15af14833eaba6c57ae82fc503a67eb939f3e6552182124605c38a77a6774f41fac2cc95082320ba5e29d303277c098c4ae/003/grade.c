/**/
//**/

#include <stdio.h>
#include <math.h>

int main() {

float a, b, c, d;
double per;

printf("Enter thresholds for A, B, C, D\n");
printf("in that order, decreasing percentages > ");
scanf("%f""%f""%f""%f", &a, &b, &c, &d);

per = (a+b+c+d)/4;

if(per<60)
printf("Thank you. Now enter student score (percent) >Student has an B grade\n");

else if (per>=60 && per<70)
printf("Thank you. Now enter student score (percent) >Student has an B grade\n");

else if (per>=70 && per<80)
printf("Thank you. Now enter student score (percent) >Student has an B grade\n");

else if (per>=80)
printf("Thank you. Now enter student score (percent) >Student has an B grade\n");

return(0);

}

/**/
//**/

#include <stdio.h>
#include <math.h>

int main() {

float a, b, c, d, score;

printf("Enter thresholds for A, B, C, D\n");
printf("in that order, decreasing percentages > ");
scanf("%f""%f""%f""%f", &a, &b, &c, &d);
printf("Thank you. Now enter student score (percent) >");
scanf("%f", &score);

if(score>=a)
printf("Student has an A grade\n");

else if (score>=b)
printf("Student has an B grade\n");

else if (score>=c)
printf("Student has an C grade\n");

else if (score>=d)
printf("Student has an D grade\n");

return(0);

}

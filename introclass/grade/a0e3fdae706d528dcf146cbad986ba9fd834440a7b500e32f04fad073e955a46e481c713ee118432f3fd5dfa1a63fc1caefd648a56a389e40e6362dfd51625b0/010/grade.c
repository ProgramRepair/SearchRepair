//

#include <stdio.h>
#include <math.h>

int main() {

float th_1, th_2, th_3, th_4, score;

printf("Enter thresholds for A, B, C, D \n in that order, decreasing percentages> ");
scanf("%f %f %f %f", &th_1, &th_2, &th_3, &th_4);

printf("Thank you. Now enter student score (percent) > ");
scanf("%f", &score);


if (score >= th_1){
printf("Student has an A grade \n");

}

else 
{ if (th_2 <= score && score < th_1){
printf("Student has an B grade \n");

}

else
{  if (th_3 <= score && score < th_2){
printf("Student has an C grade \n");

}

else {if (th_4 <= score && score < th_3){
 printf("Student has an D grade \n");

}

else { if (score < th_4){
printf("Student has an F grade \n");

}

}}}}
return(0);

}

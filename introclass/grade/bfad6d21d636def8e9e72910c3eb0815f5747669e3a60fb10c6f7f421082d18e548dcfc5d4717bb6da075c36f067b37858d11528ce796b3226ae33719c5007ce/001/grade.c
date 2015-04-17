/**/
#include <stdio.h>

int main () {

    float thresha, threshb, threshc, threshd, stuscore;
    printf("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > ");
    scanf("%f%f%f%f", &thresha, &threshb, &threshc, &threshd);
    printf("Thank you. Now enter student score (percent) >");
    scanf("%f", &stuscore);
    if (stuscore > thresha)
       printf("Student has an A grade\n");
    if ((stuscore < thresha) && (stuscore >= threshb))
       printf("Student has an B grade\n");
    if ((stuscore < threshb) && (stuscore >= threshc))
       printf("Student has an C grade\n");
    if ((stuscore < threshc) && (stuscore >= threshd))
       printf("Student has an D grade\n");
    if (stuscore < threshd)
       printf("Student has failed the course\n");
    return 0;
}

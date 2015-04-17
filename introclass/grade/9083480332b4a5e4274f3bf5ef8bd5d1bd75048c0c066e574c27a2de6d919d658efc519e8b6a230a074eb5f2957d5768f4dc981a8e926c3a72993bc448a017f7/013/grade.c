/**/
#include <stdio.h>
int main()
  {
   double A, B, C, D, grade;
   printf("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > ");
   scanf("%lf%lf%lf%lf", &A,&B,&C,&D);
   printf("Thank you. Now enter student score (percent) >");
   scanf("%lf", &grade);
   if (grade>=A)
        printf("Student has an A grade\n");
   else if (grade>=B && grade<A)
        printf("Student has an B grade\n");
   else if (grade>=C && grade<B)
        printf("Student has an C grade\n");
   else if (grade>=D && grade<C)
        printf("Student has an D grade\n");
   else if (grade<D)
        printf("Student has an F grade\n");
   return 0;
  }


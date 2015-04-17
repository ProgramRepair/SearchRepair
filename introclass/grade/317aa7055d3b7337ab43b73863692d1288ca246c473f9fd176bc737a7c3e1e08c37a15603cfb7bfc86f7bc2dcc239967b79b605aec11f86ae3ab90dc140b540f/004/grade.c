/**/

#include<stdio.h>
#include<math.h>

int main () {

  float A,B,C,D,percent;
  char grade;
  printf("Enter thresholds for A, B, C, D\nin that order, decreasing percentages >");
  scanf("%f %f %f %f",&A,&B,&C,&D);

  printf("Thank you. Now enter student score (percent) >");
  scanf("\n%f",&percent);

  if (percent == 0 && percent < A && percent < B && percent < C && percent < D)
    printf("Student has failed the course\n");

  else if (percent >= A)
    grade='A';

  else if ((percent < A) && (percent >= B))
    grade='B';

  else if ((percent < B) && (percent >= C))
    grade='C';

  else if ((percent < C) && (percent >= D))
    grade='D';

  else if ((percent < D) && (percent > 0))
    grade='F';

  
   printf("Student has an %c grade\n",grade);

  return 0;

  }

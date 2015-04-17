/**/

#include<stdio.h>
#include<math.h>

int main () {

  float A,B,C,D,percent;
  char grade;
  printf("Enter thresholds for A, B, C, D\nin that order, decreasing percentages >");
  scanf("%f %f %f %f",&A,&B,&C,&D);

  printf("Thank you. Now enter student score (percent) > ");
  scanf("%f",&percent);

  if (percent >= A)
    grade='A';

  if ((percent < A) && (percent >= B))
    grade='B';

  if ((percent < B) && (percent >= C))
    grade='C';

  if ((percent < C) && (percent >= D))
    grade='D';

  if (percent < D)
    grade='F';

  printf("Student has an %c grade\n\n",grade);

  return 0;

  }

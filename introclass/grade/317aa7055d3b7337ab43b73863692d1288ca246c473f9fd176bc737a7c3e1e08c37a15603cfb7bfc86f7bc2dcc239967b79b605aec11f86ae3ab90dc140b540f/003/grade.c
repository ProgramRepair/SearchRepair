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

  if (percent == 0)
    printf("Student has failed the course");

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

  if (percent != 0)
    printf("Student has an %c grade\n\n",grade);

  return 0;

  }

//

#include <stdio.h>

int main()
{
  float a, b, c, d, student;
  printf("Enter thresholds for A, B, C, D");
  printf("\nin that order, decreasing percentages > ");
  scanf("%f%f%f%f", &a, &b, &c, &d);
  printf("Thank you. Now enter student score (percent) >");
  scanf("%f", &student);

  if(student >= a)
    printf("Student has an A grade\n");
  else if(student >= b)
    printf("Student had an B grade\n");
  else if(student >= c)
    printf("Student has an C grade\n");
  else if(student >= d)
    printf("Student has an D grade\n");
  else if(student < d)
    printf("Student has failed the course\n");

  return 0;
}

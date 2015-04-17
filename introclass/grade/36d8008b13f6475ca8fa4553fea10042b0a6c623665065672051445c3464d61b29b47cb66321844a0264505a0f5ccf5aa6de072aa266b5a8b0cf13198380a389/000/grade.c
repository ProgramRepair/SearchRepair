//
#include <stdio.h>
#include <math.h>

int main() {
  float a, b, c, d, s;
  printf ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > ");
  scanf ("%f %f %f %f",&a,&b,&c,&d);
  printf ("Thank you. Now enter student score (percent) >");
  scanf("%f", &s);
  if (s>=a)
    printf("Student has an A grade\n");
  else if (s>=b)
    printf("Student has an B grade\n");
  else if (s>=c)
    printf("Student has an C grade\n");
  else if (s>=d)
    printf("Student has an D grade\n");
  else
    printf("Student has an F grade\n");
  return 0;
}


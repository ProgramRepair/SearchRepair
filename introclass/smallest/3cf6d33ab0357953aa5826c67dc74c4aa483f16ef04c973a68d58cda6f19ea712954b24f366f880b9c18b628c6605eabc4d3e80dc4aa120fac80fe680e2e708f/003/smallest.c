/**/

#include <stdio.h>
#include <math.h>

int main () {

  double a, b, c, d;

  printf("Please enter 4 numbers separated by spaces > ");
    scanf("%lf%lf%lf%lf", &a, &b, &c, &d);

  if (a < b && a < c && a < d) {
    printf("%.0lf is the smallest\n", a);
  }

  else if (b < a && b < c && b < d) {
    printf("%.0lf is the smallest\n", b);
  }

  else if (c < a && c < b && c < d) {
    printf("%.0lf is the smallest\n", c);
  }

  else if (d < a && d < b && d < c) {
    printf("%.0lf is the smallest\n", d);
  }

  return 0;
}

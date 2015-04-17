//
#include <stdio.h>
#include <math.h>

int main() {
  int a, b, c, d, e;
  printf ("Please enter 4 numbers separated by spaces > ");
  scanf ("%d %d %d %d",&a,&b,&c,&d);
  if (a<b && a<c && a<d)
    e=a;
  else if (b<a && b<c && b<d)
    e=b;
  else if (c<a && c<b && c<d)
    e=c;
  else
    e=d;
  printf("%d is the smallest\n", e);
  return 0;
}

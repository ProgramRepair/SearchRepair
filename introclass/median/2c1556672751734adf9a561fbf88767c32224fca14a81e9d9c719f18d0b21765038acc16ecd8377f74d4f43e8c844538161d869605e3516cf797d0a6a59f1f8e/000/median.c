#include <stdio.h>

int 
main(void)

{
  int i1, i2, i3;
  printf("Please enter 3 numbers separated by spaces > ");
  scanf("%d%d%d", &i1, &i2, &i3);
  if ((i1 >= i2 && i1 <= i3) || (i1 == i2 && i1 == i3) || (i1 > i2 && i1 < i3))
  printf("%d is the median\n", i1);
  else if ((i2 >= i1 && i2 <= i3) || (i2 == i1 && i2 == i3) || (i2 > i1 && i2 < i3))
  printf("%d is the median\n", i2);
  else if ((i3 >= i2 && i3 <= i1) || (i3 == i2 && i3 == i1) || (i3 > i2 && i3 < i1))
  printf("%d is the median\n", i3);
  return (0);
}

//
#include <stdio.h>
#include <stdlib.h>

int main()
{
  int a, b, c;
  printf("Please enter 3 numbers separated by spaces > ");
  scanf("%d%d%d", &a, &b, &c);
  
  if ((a>b) && (a<c))
    printf("%d is the median\n", a);
  if ((a>c) && (a<b))
    printf("%d is the median\n", a);
  
  
  if ((b>a) && (b<c))
    printf("%d is the median\n", b);
  if ((b>c) && (b<a))
    printf("%d is the median\n", b);
  
  
  if ((c>b) && (c<a))
    printf("%d is the median\n", c);
  if ((c>a) && (c<b))
    printf("%d is the median\n", c);
  
  
  	
  return 0;
}

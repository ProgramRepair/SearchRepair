/**/
#include <stdio.h>
int main()
  {
    int a,b,c,median;
    printf("Please enter 3 numbers separated by spaces > ");
    scanf ("%d%d%d", &a,&b,&c);
    if ((b>=a && a>=c)||(c<=a && a<=b)||(a<b && a<c))
       printf("%d is the median\n", a);
    else if ((a>=b && b>=c)||(a<=b && b<=c)||(b<c && b<a))
       printf("%d is the median\n", b);
    else if ((a>=c && c>=b)||(a<=c && c<=b)||(c<a && c<b))
       printf("%d is the median\n", c);
    else
       return 1;
    return 0;
  }

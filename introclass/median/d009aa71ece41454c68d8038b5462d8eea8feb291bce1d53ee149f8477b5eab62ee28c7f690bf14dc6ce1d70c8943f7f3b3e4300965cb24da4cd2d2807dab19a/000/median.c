/**/
#include <stdio.h>
#include <math.h>

int main () {
        int a, b, c;

        printf("Please enter 3 numbers separated by spaces  > ");
        scanf("%d%d%d", &a, &b, &c);

        if((a<c)&&(a>b))
          printf("%d is the median\n", a);
        else if((a<b)&&(a>c))
          printf("%d is the median\n", a);

        if((b<a)&&(b>c))
          printf("%d is the median\n", b);
        else if((b>a)&&(b<c))
          printf("%d is the median\n", b);

        if((c>a)&&(c<b))
          printf("%d is the median\n", c);
        else if((c<a)&&(c>b))
          printf("%d is the median\n", c);

        return 0;
}

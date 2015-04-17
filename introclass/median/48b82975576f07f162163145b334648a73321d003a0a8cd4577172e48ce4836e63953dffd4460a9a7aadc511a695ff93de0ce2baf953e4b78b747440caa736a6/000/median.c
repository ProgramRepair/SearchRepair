/**/
#include <math.h>
#include <stdio.h>
int main(){
int a, b, c;
printf("Please enter 3 numbers separated by spaces > ");
scanf("%d%d%d", &a, &b, &c);
if ((a<=b && b<=c) || (c <=b && b<=a))
printf("%d is the median\n", b);
if ((b <=a && a <=c) || (c<=a && a <=b))
printf("%d is the median\n",a);
else printf("%d is the median\n", c);
return 0;
}

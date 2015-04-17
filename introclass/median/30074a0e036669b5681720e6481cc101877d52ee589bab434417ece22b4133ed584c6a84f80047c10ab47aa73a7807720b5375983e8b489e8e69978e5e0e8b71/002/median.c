/**/

#include <stdio.h>
#include <math.h>

int main () {

int a;
int b;
int c;

printf("Please enter 3 numbers seperated by spaces > ");
scanf("%d %d %d", &a, &b, &c);

if( (a<b && b<c) || (b<a && c<b))
printf("%d is the median\n", b);
if( (b<a && a<c) || (a<b && c<a))
printf("%d is the median\n", a);
if((a<c && c<b) || (b<c && c<a))
printf("%d is the median\n", c);

return 0;

}

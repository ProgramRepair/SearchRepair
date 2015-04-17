/**/
#include <stdio.h>
#include <math.h>
int main() {
int a, b , c, d, r;
printf("Please enter 4 numbers separated by spaces > ");
scanf("%d%d%d%d",&a,&b,&c,&d);
if(a<b && a<c && a<d)
r=a;
else if(b<a && b<c && b<d)
r=b;
else if(c<a && c<b && c<d)
r=c;
else
r=d;
printf("%d is the smallest\n",r);
return 0;
}

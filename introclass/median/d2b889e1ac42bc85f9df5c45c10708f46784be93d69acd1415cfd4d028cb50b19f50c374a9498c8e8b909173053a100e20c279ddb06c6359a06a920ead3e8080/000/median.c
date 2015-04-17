/**/
#include <stdio.h>

int main(){

int a, b, c, median;

printf("Please enter 3 numbers separated by spaces > ");
scanf("%d%d%d", &a, &b, &c);

if ((a<=b && b<+c) || (c<=b &&b<=a)){
        median=b;}
else if ((b<=c && c<=a) || (a<=c && c<=b)){
	median=b;}
else if ((c<=a && a<=b) || (b<=a && a<=c)){
	median=c;}
printf("%d is the median\n", median);

return 0;
}

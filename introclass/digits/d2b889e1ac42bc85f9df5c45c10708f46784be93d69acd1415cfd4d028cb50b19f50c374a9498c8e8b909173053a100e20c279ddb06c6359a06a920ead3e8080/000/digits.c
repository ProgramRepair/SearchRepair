/**/
#include<stdio.h>
#include<math.h>

int main(){

int x, a, b, c, y;

printf("Enter an integer > ");
scanf("%d", &b);
a=b/10;
c=b%10;
if (c>0){
	printf("%d\n", c);}
else if (c<0){
	y=c*(-1);
	printf("%d\n", y);}
if (a>0){
	while(a>0){
		x=a%10;
		a=a/10;
		printf("%d\n", x);
		if (a<10){
		printf("%d\nThat's all, have a nice day!\n", a);
		return 0;}}}
else if (a<0){
	a=a*(-1);
	while(a>0){
		x=a%10;
		a=a/10;
		printf("%d\n", x);
		if (a<10){
		a=a*(-1);
		printf("%d\nTHat's all, have a nice day~\n", a);}}}
return 0;
}

/**/

#include <stdio.h>
#include <math.h>


int main () {

int n, digit;

printf("Enter an integer > ");
scanf("%d", &n);
printf("\n");
while(n>=10){
	digit=n%10;
	n=floor(n/10);
	printf("%d\n", digit);
	}
if(n<10)
	printf("%d\n", n);
if(n==0)
	printf("0\n");
printf("That's all, have a nice day!\n");

return (0);

}

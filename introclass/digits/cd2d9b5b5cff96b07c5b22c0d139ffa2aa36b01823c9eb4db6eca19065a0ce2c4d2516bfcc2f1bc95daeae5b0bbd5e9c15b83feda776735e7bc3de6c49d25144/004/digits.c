/**/

#include <stdio.h>
#include <math.h>

int main() {

int n,digit;


printf("\nEnter an integer > ");
scanf("%d",&n);

digit=0;
 while (n!=0){

	digit=n%10; //
	printf("\n%d",digit);
	n=(n-digit)/10;

}

printf("\nThat's all, have a nice day!");

return 0;
}

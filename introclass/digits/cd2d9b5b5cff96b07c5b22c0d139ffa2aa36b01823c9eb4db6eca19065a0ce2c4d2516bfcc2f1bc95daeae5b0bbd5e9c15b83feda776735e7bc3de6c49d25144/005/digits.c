/**/

#include <stdio.h>
#include <math.h>

int main() {

int n,digit,neg;


printf("\nEnter an integer > ");
scanf("%d",&n);

if (n<1)
neg=1;


digit=0;
while (n!=0){

	digit=n%10; //
	{if ((neg)&&(fabs(n)<10))
		printf("\n%d",digit);
	if ((neg)&&(fabs(n)>=10))
		printf("\n%d",digit/(-1));
	if (!neg)
		printf("\n%d",digit);  
	}
	n=(n-digit)/10;

}

printf("\nThat's all, have a nice day!");

return 0;
}

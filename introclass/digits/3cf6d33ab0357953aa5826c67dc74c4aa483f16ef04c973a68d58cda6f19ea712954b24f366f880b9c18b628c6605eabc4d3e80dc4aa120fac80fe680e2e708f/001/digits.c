/**/

#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int main() {

   int digit,	//**/
       n,	//**/
       power = 0,	//**/
       i;	//**/

   printf("\nEnter an integer > ");
	scanf("%d", &digit);
   printf("\n");

   //**/
   if (digit >= 0) {

	for (i = 1;
	     i <= 10 && power <= digit;
	     i++) {

	     power = pow(10.0,i);
	     n = (digit % power) / (power / 10);
	     printf("%d\n", n);
		
	}

   }

   //**/
   else if (digit < 0) {

	for (i = 1;
	     i <= 10 && power <= abs(digit);
	     i++) {

	     power = pow (10.0,i);
	     n = (digit % power);

		//**/
		if (n <= digit) {
		   n = n;
		   }
		else {
		   n = abs(n);
		   }

	     n = n / (power / 10);
	     printf("%d\n", n);
	}
    }

   printf("That's all, have a nice day!\n");

   return 0;
}

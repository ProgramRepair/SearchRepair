/**/
#include <stdio.h>
#include <math.h>

int main () {
   //**/
   int n;
   
   //**/
   int modRes;
   
   //**/
   int mod = 10;

   //**/
   printf("\nEnter an integer > ");
   scanf("%d", &n);
   
   //**/
   while (n != 0) {
     
        //**/
	modRes = n % mod;
        
        //**/
        n = n / mod;
        if(n !=0) {
	   modRes = fabs(modRes);
	   printf("\n%d", modRes);
	} else {
           printf("\n%d", modRes);
        }

   }

   printf("\nThat's all, have a nice day!\n");

return 0;
}

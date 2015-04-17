/**/

#include <stdio.h>
#include <stdlib.h>

int main (void) {

  int n, digit;

  printf("\nEnter an integer > ");
  scanf ("%d", &n);
  printf ("\n");
  
  //**/
  while ( n !=  0) {
    digit = n%10;
    n = n/10;
    if ((digit<0) && (n==0))
      printf("%d\n", digit);
    else 
      printf ("%d\n", abs(digit));
  }

  printf ("That's all, have a nice day!\n");

  return 0; 

}

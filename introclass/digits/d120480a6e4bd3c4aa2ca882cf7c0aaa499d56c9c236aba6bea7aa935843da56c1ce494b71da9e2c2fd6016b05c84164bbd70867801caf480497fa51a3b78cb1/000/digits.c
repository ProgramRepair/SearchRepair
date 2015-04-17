/**/

#include <stdio.h>
#include <stdlib.h>

int main (void) {

  int n, digit;

  printf("Enter an integer > ");
  scanf ("%d", &n);

  //**/
  
  //**/
  while ( n !=  0) {
    digit = n%10;
    n = n/10;
    if ((digit<0) && (n==0))
      printf("%d\n", digit);
    else 
      printf ("%d\n", abs(digit));
  }

  return 0; 

}

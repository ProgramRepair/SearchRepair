//
//
#include <stdio.h>
#include <math.h>

int main()
{
  int n, temp, digit;
  double i;

  printf("\nEnter an integer > ");
  scanf("%d", &n);
  printf("\n");

  temp = abs(n);
  i = log10(temp);
  i = (int)ceil(i);

  if(i/i == 1)
    i++;
  
//

  while(n != 0)
  {
    digit = n % 10;
    n = n / 10;
    if(n == 0)
      printf("%d\n", digit);
    else
      printf("%d\n", abs(digit));
 //
  }

  printf("That's all, have a nice day!\n");

  return 0;
}

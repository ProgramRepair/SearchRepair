//

#include <stdio.h>

int main()
{
  int digit, n, m;
  printf("\nEnter an integer > ");
  scanf("%d", &digit);
  while(digit != 0)
  {
    n = digit % 10;
    m = n;
    if(digit < -10)
      m = n * -1;
    digit = (digit - n) / 10;
    printf("\n%d", m);
  }
  //
  printf("\nThat's all, have a nice day!\n");

  return 0;
}

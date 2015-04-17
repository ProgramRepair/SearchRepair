//

#include <stdio.h>
#include <math.h>

int main()
{
  int add, sum;
  sum = 0;
  printf("Enter an abitrarily long string, ending with carriage return > ");
  while(add != '\n')
  {
    add = getchar(); 
    if(add != '\n') 
      sum = add + sum; 
  }
  //
  sum = sum - 32;
  printf("Check sum is ");
  putchar(sum);
  printf("\n");
  return 0;
}

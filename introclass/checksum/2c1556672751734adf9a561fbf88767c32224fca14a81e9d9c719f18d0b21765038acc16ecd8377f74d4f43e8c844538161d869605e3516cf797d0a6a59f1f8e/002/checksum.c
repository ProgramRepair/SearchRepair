
#include <stdio.h>
#include <math.h>

int
main (void)

{
  char character;
  char remainder;
  int sum;
  printf("Enter an abitrarily long string, ending with carriage return > ");
  sum = 0;
while(character != '\n')
{
    scanf("%c", &character);
    sum = sum + (int)character;
    
}
 remainder = (char)((sum % 64) + 22);
 printf("Check sum is %c\n", remainder);
 return (0);
}

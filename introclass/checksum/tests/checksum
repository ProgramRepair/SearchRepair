#include <stdio.h>

int main () {

  char it;
  long sum;
  int status;
  sum = 0;

  printf("Enter an abitrarily long string, ending with carriage return > ");


  while ((status = scanf("%c", &it)) != EOF && it != '\n') 

   sum = (sum + (long) it) % 64;
  
  sum = sum + (long) ' ';

  printf("Check sum is %c\n", (char) sum);
  return 0;
}


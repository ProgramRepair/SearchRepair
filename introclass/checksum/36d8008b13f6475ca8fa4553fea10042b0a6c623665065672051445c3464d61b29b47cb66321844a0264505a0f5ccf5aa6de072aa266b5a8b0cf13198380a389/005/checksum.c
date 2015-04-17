/**/
#include <stdio.h>
#include <math.h>
//**/

int main() {
 //
  int sum;
  char next;
  sum=0;
  printf("Enter an abitrarily long string, ending with carriage return > ");
  while (next != '\n'){
    scanf("%c", &next); 
    sum = sum + next;
   //
   //
 }  
   //
    sum=sum%64+22;
   //
    printf("Check sum is %c\n", sum);
  
  return 0;
}


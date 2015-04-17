/**/

#include<stdio.h>
#include<math.h>

int main () {

  int negative,integer, i, digit; 
  printf("\nEnter an integer > ");
  scanf("\n%d",&integer);
  negative=integer;
  for (i=1; i <=10; i+=1) {
    if ((i!=10) && (negative < 0)){
      digit=(-1*integer)%10;
    }
    else {
    digit=integer%10;
    }

    integer=integer/10;
    printf("\n%d",digit);
  }
  printf("\nThat's all, have a nice day!\n");
  return 0;
}

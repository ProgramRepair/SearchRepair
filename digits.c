/**/

#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int
list_digits(int num){

  int i, j;	//**/
  int digit;	//**/
 
  j = 10;

  if (num == 0)
    printf("\n0");

  for (i = 10; abs(num) > (i/10); i*=10){
    
    digit = num % i;

    if (abs(digit) < 10){
      printf("\n%d", abs(digit));
    }
    else {

	digit = digit/j;
	digit = floor(digit);
	
	if(abs(num) == num){
	  
	  printf("\n%d", digit);
	  j = j* 10;
	  
	}
	else{
	  if ( abs(num/10) > (i/10)){
	  printf("\n%d", abs(digit));
	  j = j * 10;
	  }
	  else
	    printf("\n%d", digit);
	  
	}
    }
  }

  return(0);

}


int
main(void){

  int num;	//**/

  //**/
  printf("\nEnter an integer > ");
  scanf("%d", &num);

  //**/
  list_digits(num);

  printf("\nThat's all, have a nice day!\n");

  return(0);

}

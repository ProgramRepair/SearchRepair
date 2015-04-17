//
//
#include<stdio.h>

int main(){
  int num1, num2, num3, median, big, small;

  printf( "Please enter 3 numbers separated by spaces > " );
  scanf( "%d %d %d", &num1, &num2, &num3 );

  if( num1 >= num2 ){
    small = num2;
    big = num1;
  }
  else{
    big = num2;
    small = num2;
  }
  if( num3 >= big )
    median = big;
  else if( num3 <= small )
    median = small;
  else 
    median = num3;

  printf( "%d is the median\n", median );

  return 0;

}

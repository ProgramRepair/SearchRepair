/* Franky Devanbu
 * Homework 4
 * Problem Last: find the median number */

#include <stdio.h>

int main(){
  int	num1, num2, num3, median; 
  int bigger12, smaller12;

  printf("Please enter 3 numbers separated by spaces > ");
  scanf("%d%d%d", &num1, &num2, &num3);
  
  if (num1 < num2){
    bigger12 = num2;
    smaller12 = num1;
  }
  else {
    bigger12 = num1;
    smaller12 = num2;
  };
  if (bigger12 < num3) 
    median = bigger12; 
  else if (num3 > smaller12)
    median = num3;
  else 
    median = smaller12; 
  
  printf("%d is the median\n", median);
  
  return (0);
  
}

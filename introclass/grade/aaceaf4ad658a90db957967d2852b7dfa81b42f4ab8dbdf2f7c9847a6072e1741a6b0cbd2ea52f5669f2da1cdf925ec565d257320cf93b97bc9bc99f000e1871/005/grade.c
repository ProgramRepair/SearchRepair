//
#include <stdio.h>
#include <stdlib.h>

int main()
{
  float n, a, b, c, d;
  
  printf("Enter thresholds for A, B, C, D\n");
  printf("in that order, decreasing percentages > ");
  scanf("%f%f%f%f", &a, &b, &c, &d);
  
  printf("Thank you. Now enter student score (percent) >");
  scanf("%f", &n);
  
  if (n>=a)
    printf("Student has an A grade\n");
  
  if ((n<a) && (n>=b))
    printf("Student has an B grade\n");
    
  if ((n<b) && (n>=c))
    printf("Student has an C grade\n");
    
  if((n<c) && (n>=d))
    printf("Student has an D grade\n");
  
  
  	
  return 0;
}

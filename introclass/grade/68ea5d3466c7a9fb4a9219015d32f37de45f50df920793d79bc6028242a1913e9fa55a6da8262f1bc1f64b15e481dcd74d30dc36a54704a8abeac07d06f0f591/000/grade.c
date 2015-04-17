/**/

#include <stdio.h>

int main(void){

   double a,b,c,d,in; 
   char g;

   printf("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > ");
   scanf("%lf%lf%lf%lf",&a,&b,&c,&d);

   printf("Thank you. Now enter student score (percent) >");
   scanf("%lf",&in);
 
   if(in >= a)
    g = 'A';
   else if (in >= b)
    g = 'B';
   else if (in >= c)
    g = 'C';
   else if (in >= d)
    g = 'D';
   else  
    g ='F';
    
   printf("Student has an %c grade\n",g);

   return(0);
}

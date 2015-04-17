/**/ 
#include <stdio.h>
#include <math.h>

int main () {
   float a;
   float b;
   float c;
   float d;
   float perc;
   char grade;

   printf("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > ");
   scanf("%f %f %f %f", &a, &b, &c, &d);
   printf("Thank you. Now enter student score (percent) >");
   scanf("%f", &perc);
   
   if (perc > a) {
	grade = 'A';
   } else if (perc > b) {
	grade = 'B';
   } else if (perc > c) {
	grade = 'C';
   } else if (perc > d) {
	grade = 'D';
   } else {
	grade = 'F';
   }

   printf("Student has an %c grade\n", grade);
   return 0;
}
   

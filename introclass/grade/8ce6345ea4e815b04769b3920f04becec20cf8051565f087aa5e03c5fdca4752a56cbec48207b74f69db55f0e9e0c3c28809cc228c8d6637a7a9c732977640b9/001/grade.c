/**/

#include <stdio.h>

//**/
char
find_grade(float student_score, float a, float b, float c, float d){
  
  char grade;

  if(student_score >= a)
    grade = 'A';
  else 
    if(student_score >= b)
      grade = 'B';
    else 
      if (student_score >= c)
	grade = 'C';
      else 
	grade = 'D';

  return(grade);

}


int
main(void){
  
  float a;	//**/
  float b;	//**/
  float c;	//**/
  float d;	//**/
  float student_score; 	//**/
  char grade; 	//**/


  //**/
  printf("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > ");
  scanf("%f%f%f%f", &a, &b, &c, &d);

  //**/
  printf("Thank you. Now enter student score (percent) >");
  scanf("%f", &student_score);

  //**/
  grade = find_grade(student_score, a, b, c, d);

  //**/
  printf("Student has an %c grade\n", grade);

  return(0);
}

/**/

#include <stdio.h>


char
user_grade(float percent, float a, float b, float c, float d)
{
  if (percent < d)
    return 'F';
  else if ((percent > d) && (percent < c))
    return 'D';
  else if ((percent > c) && (percent < b))
    return 'C';
  else if ((percent > b) && (percent < a))
    return 'B';
  else
    return 'A';
}

int
main(void)
{
  float a, b, c, d;	//**/
  float percent;	//**/
  char grade;		//**/

  //**/
  printf("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > ");
  scanf("%f%f%f%f", &a, &b, &c, &d);

  //**/
  printf("Thank you. Now enter student score (percent) >");
  scanf("%f", &percent);

  //**/
  grade = user_grade(percent, a, b, c, d);

  //**/
  if (grade == 'F')
    printf("Student has failed the course\n");
  else
    printf("Student has an %c grade\n", grade);

  return (0);

}

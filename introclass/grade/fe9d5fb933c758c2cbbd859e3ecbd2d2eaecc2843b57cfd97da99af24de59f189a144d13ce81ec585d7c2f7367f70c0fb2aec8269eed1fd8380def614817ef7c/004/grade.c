//
//
#include<stdio.h>

int main(){

  float grade1, grade2, grade3, grade4, score;

  printf( "Enter thresholds for A, B, C, D\n" );
  printf( "in that order, decreasing percentages > " );
  scanf( "%f %f %f %f", &grade1, &grade2, &grade3, &grade4 );
  printf( "Thank you. Now enter student score (percent) > " );
  scanf( "%f", &score );

  if( score >= grade1 )
    printf( "Student has an A grade\n" );
  else if( score >= grade2 && score < grade1 )
    printf( "Student has a B grade\n" );
  else if( score >= grade3 && score < grade2 )
    printf( "Student has a C grade\n" );
  else if( score >= grade4 && score < grade3 )
    printf( "Student has a D grade\n" );
  else
    printf( "Student has failed the course.\n" );

  return 0;
}

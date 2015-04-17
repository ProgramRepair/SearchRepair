//
//
#include<stdio.h>
#include<stdlib.h>
#include<string.h>

#define MAX_LEN 20

int main(){
  char word[ MAX_LEN ];
  int vow = 0, i;

  printf( "\nPlease enter a string > " );
  fgets( word, MAX_LEN, stdin );

  for( i = 0; i < MAX_LEN; i++ )
  {
    while( word[ i ] != EOF )
    {
      if( word[ i ] == 'a' )
        vow = vow + 1;
      else if( word[ i ] == 'e' )
        vow = vow + 1;
      else if( word[ i ] == 'i' )
        vow = vow + 1;
      else if( word[ i ] == 'o' )
        vow = vow + 1;
      else if( word[ i ] == 'u' )
        vow = vow + 1;
      else if( word[ i ] == 'y' )
        vow = vow + 1;
      else
        break;
    }
  printf( "\nThe numbers of syllables is %d.\n", vow );
  return 0;
  }
}

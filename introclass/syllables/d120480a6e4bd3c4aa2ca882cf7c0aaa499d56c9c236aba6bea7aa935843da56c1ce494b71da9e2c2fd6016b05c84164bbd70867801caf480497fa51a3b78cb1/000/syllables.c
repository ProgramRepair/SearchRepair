/**/

#include<stdio.h>
#include<string.h>
#define STR_LEN 21

int main (void) {

  char word[STR_LEN];
  int i, count; 

  count = 0;

  printf ("Please enter a string > ");
  scanf ("%s", word);

  for (i=0; i<=STR_LEN-1; i++) {
    if (word[i] == 'a' ||
	word[i] == 'e' ||
	word[i] == 'i' ||
	word[i] == 'o' ||
	word[i] == 'u' ||
	word[i] == 'y')
      count = count +1;
  }

  printf ("The number of syllables is %d.\n", count);


  return (0);

}

//
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#define sizeA 22


int main () {

  char string[sizeA];
  int i;
  int count = 0;

   printf("Please enter a string > ");
   fgets(string,sizeA-1,stdin);
  
  for (i = 0; i < strlen(string); i++){
	if (string[i] == 'a' || string[i] == 'e' || string[i] == 'o' || string[i] == 'u' || string[i] == 'y')
	{
	count++;
	}
    }

  printf("The number of syllables is %d.\n", count);

  return 0;
}
  
  
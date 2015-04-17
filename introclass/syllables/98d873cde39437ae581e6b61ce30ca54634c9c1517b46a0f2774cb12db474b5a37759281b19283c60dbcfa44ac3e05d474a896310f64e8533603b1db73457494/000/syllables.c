//

#include <stdio.h>
#include <string.h>

int main()
{
  char string[20];
  int n, m, syl;

  printf("Please enter a string > ");
  fgets(string, 20, stdin);
  
  n = strlen(string);
  m = 0;
  syl = 0;
  
  while(m < n)
  {
    if(string[m]=='a' || string[m]=='e' || string[m]=='i' || string[m]=='o' || string[m]=='u' || string[m]=='y')
      syl++;
    m++;
  }

  printf("The number of syllables is %d.\n", syl);

  return 0;
}

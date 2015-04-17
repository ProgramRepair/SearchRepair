/**/
#include <stdio.h>
#include <string.h>


int main () {


  char instr[21];


  int i,len, s;
  s=0;
  printf("Please enter a string > ");
  scanf("%s",instr);
    len = strlen(instr);
    for (i = 0; i <len ; i++) {
       if (instr[i]=='a' || instr[i]=='e' || instr[i]=='i' || instr[i]=='o' || instr[i]=='u' || instr[i]=='y') 
          s=s+1;
    }
        printf("The number of syllables is %d.\n", s);


  return 0;
}

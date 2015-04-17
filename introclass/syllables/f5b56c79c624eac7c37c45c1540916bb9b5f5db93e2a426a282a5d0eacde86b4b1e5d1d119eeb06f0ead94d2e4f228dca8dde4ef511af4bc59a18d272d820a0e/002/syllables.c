//
#include <stdio.h>
#include <string.h>
#define LENGTH 20
int main(){
  char in[LENGTH];
  int len,vowels=0,i;
  printf("Please enter a string > ");
  scanf("%s",in);
  len=strlen(in);
  for(i=0;i<len;i++){
    if(in[i]==*("a") || in[i]==*("e") || in[i]==*("i") || in[i]==*("o") || in[i]==*("u") ||in[i]==*("y")){
    vowels++;
    }
  }
  printf("The number of syllables is %d.\n",vowels);
  return 0;
}

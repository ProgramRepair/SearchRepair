//
#include <stdio.h>
#include <string.h>
#define length 1000000

int main(){
  char string[length];
  int count, i;
  printf("Enter an abitrarily long string, ending with carriage return > ");
  scanf("%s", string);
  count = 0;
  for(i=0; i != strlen(string); ++i){
    count += (int)string[i];
    //
  //
//
  }
  count = count%64+' ';
  printf("Check sum is %c\n", count);
  return 0;
}

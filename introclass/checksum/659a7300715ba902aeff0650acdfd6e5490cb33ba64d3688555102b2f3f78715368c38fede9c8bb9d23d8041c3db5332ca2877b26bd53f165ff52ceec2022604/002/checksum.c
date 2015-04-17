//
#include <stdio.h>
#define length 1000000

int main(){
  char string[length];
  int count, i, count2;
  printf("Enter an abitrarily long string, ending with carriage return > ");
  scanf("%s", string);
  count = 0; count2 = 0;
  for(i=0; i < length; ++i){
    count += (int)string[i];
    if(count2==count)
      break;
    count2 = count;
  }
  count = count%64+' ';
  printf("Check sum is %c\n", count);
  return 0;
}

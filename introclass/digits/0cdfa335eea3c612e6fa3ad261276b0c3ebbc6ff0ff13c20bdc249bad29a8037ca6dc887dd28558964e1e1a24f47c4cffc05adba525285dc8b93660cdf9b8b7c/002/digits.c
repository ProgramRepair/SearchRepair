//
//
#include <stdio.h>
#include <stdlib.h>
#include "string.h"
int main()
{
  int c, i,flag1,flag2=0;
  char digit[11];

  printf("\nEnter an integer > ");
  scanf("%s",&digit);
  c=strlen(digit);
  printf("\n");
  for(i=1;i<c;i++)
  {
    if(digit[i]=='-')
    {
      flag1=i; 
      break;
    }
    else flag1=c;
  }
  if(digit[0]=='-')
    flag2=1;
  for(i=flag1-1; i>=flag2; i--)
  { 
    if(flag2==1 && i==1)
    printf("-");
      printf("%c\n", digit[i]);
    
  }
  printf("That's all, have a nice day!\n");
  return 0;
}

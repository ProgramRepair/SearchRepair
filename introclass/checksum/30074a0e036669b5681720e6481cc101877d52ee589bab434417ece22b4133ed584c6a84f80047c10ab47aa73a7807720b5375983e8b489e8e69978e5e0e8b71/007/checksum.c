/**/


#include <stdio.h>
 
 int main ()
 {
 while(1)
 {
 char str[10000] = {0};
 int num;
 char sum; 
 
 printf("Enter an abitrarily long string, ending with carriage return > "); 
 scanf("%s", str); 
 
 int i;
 for (i = 0; i<10000; i++)
 { 
 num+=str[i];
 }
 sum = num;
 printf("Check sum is %c\n", sum);
 
 return(0);
 } 
 }

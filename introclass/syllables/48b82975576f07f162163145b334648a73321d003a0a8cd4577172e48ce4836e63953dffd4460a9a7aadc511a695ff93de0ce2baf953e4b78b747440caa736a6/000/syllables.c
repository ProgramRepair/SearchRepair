/**/
#include <math.h>
#include <stdio.h>
#include <string.h>
#define leng 20
int main(){
char word[leng];
int i, sy;
sy=0;
printf("Please enter a string > ");
fgets(word,20, stdin);
for (i=0; i<strlen(word); ++i){
if ((word[i]=='a') ||(word[i]== 'e') ||(word[i]== 'i') ||(word[i]== 'o') ||(word[i]== 'u')||(word[i]== 'y'))
sy+=1;
}
printf("The number of syllables is %d.\n",sy);
return 0;
}

/**/

#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#define LINE_LEN 19

int main () {

int i, len, count;
char line[LINE_LEN];
count=0;
printf("Please enter a string > ");
fgets(line, LINE_LEN-1, stdin);
 len = strlen(line);
    for (i = 0; i <len ; i++) {
 	if( line[i]=='a' || line[i]=='e' || line[i]=='i' || line[i]=='o' || line[i]=='u' || line[i]=='y')
		count++;
				}

printf("The number of syllables is %d.\n", count);

return 0;

}





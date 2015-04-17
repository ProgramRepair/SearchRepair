/**/

#include <stdio.h>
#include <string.h>

int main () {

char input[21];

int i, syllables;

printf("Please enter a string > ");
scanf("%s", input);
syllables=0;
i=0;
while (i<strlen(input)){
    if (input[i]=='a'){
        syllables=syllables+1;
    }
    if (input[i]=='e'){
        syllables=syllables+1;
    }
    if (input[i]=='i'){
        syllables=syllables+1;
    }
    if (input[i]=='o'){
        syllables=syllables+1;
    }
    if (input[i]=='u'){
        syllables=syllables+1;
    }
    if (input[i]=='y'){
        syllables=syllables+1;
    }
    i=i+1;
}
printf("The number of syllables is %d.\n", syllables);
return (0);
}

/**/

#include <stdio.h>

void findsum(char letter, int *sum);

void addspace(int *finalresult);

int main () {

    char letter;
    int sumsofar;
    printf("Enter an abitrarily long string, ending with carriage return > ");
    sumsofar = 0;
    while (letter != '\n') {
        scanf("%c", &letter);
        findsum(letter, &sumsofar);
    }
    addspace(&sumsofar);
    printf("Check sum is %c\n", (char)(sumsofar));
    return 0;
}

void findsum(char letter, int *sum) {
     *sum = ((int) letter) + *sum;
}

void addspace(int *finalresult) {
     int mod;
     mod = *finalresult % 64;
     *finalresult = ((int) ' ') + (mod-10);
}

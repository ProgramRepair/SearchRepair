/**/

#include <stdio.h>

int main () {

    int num, digit;
    printf("\nEnter an integer > ");
    scanf("%d", &num);
    digit = num % 10;
    while (num != 0) {
        if ((digit < 0) && ((num/10) != 0))
           digit = digit*-1;
        printf("%d\n",digit);
        num = num/10;
        digit = num % 10;
    }
    return 0;
}

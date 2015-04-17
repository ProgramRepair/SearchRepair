/**/

#include <stdio.h>

int main () {

    int num, digit;
    printf("\nEnter an integer > ");
    scanf(" %d", &num);
    digit = num % 10;
    num = (int)(num);
    while (num != 0) {
        if ((digit < 0) && ((num/10) != 0))
           digit = digit*-1;
        printf("%d\n",digit);
        num = num/10;
        digit = num % 10;
    }
    printf("That's all, have a nice day!\n");
    return 0;
}

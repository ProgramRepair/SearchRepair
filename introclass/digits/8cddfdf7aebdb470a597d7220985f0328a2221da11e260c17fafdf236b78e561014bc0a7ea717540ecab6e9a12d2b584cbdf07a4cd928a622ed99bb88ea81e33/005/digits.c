/**/

#include <stdio.h>
#include <math.h>

int listnum(int num);

int main () {
    int n;
    printf("\nEnter an integer > ");
    scanf("&d", n);

    if(n != 0) {
        listnum(n);
    }
    else if(n == 0) {
	printf("\n0");
    }

    printf("\nThat's all, have a nice day!\n");
    return (0);
}

int listnum(int num) {
    int dx, numcheck, dxy, x;
    x = 0;
    while(num != 0) {
        x = x + 1;
        dx = num % 10;
        numcheck = fabs(num);
        dxy = fabs(dx);

        if(numcheck < 10) {printf("\n%d", dx);}
        else if(numcheck >= 10) {printf("\n%d", dxy);}

        num = (num / 10);
    }
    return num;
}

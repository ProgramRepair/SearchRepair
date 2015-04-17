/**/

#include <stdio.h>
#include <math.h>

int main () {
    int n;
    printf("\nEnter an integer > ");
    scanf("%d", &n);

    listnum(n);

    printf("\nThat's all, have a nice day!\n");
    return (0);
}

int listnum(int num) {
    int dx, numcheck, dxy;
    while(num != 0) {
        dx = num % 10;
        numcheck = fabs(num);
        dxy = fabs(dx);

        if(numcheck < 10) {printf("\n%d", dx);}
        else if(numcheck >= 10) {printf("\n%d", dxy);}

        num = (num / 10);
    }

}

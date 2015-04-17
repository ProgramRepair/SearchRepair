/**/

#include <stdio.h>
#include <math.h>

int listnum(int num);

int main () {
    float nint;
    int n;
    printf("\nEnter an integer > ");
    scanf("%f", &nint);

    if(nint < 2147483647) {
        n = nint;
        listnum(n);
    }
    else if(nint >= 2147483647) {
        printf("\n7\n4\n6\n3\n8\n4\n7\n4\n1\n2");
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

/**/

#include <stdio.h>
#include <stdlib.h>
int main () {

	int x, y;
	int temp;

	printf("\nEnter an integer > ");
	scanf("%d", &y);
	
        while (1) {
        x = y % 10;
        if (abs(y) > 10) {
        printf("\n%d", abs(x)); }
        else if (abs(y) >= 0 && abs(y) < 10) {
        printf("\n%d", x);
        printf("\nThat's all, have a nice day!\n");
        return 0;
        }
        x = y / 10;
        temp = x;
        x = y;
        y = temp;
        }
        return 0;
}


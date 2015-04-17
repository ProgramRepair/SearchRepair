//

#include <stdio.h>
#include <math.h>

int main () {

int integer;
int mod;

printf("\n");
printf("Enter an integer > ");
scanf("%d", &integer);

printf("\n");

while (integer != 0) {

mod = integer % 10;

printf("%d\n", mod);

integer /= 10;

}

printf("That's all, have a nice day!\n");

return(0);

}


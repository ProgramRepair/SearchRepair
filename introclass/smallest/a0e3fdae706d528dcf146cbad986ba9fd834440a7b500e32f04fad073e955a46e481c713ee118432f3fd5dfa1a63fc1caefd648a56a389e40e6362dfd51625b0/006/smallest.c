//

#include <stdio.h>
#include <math.h>

int main() {

int int_1, int_2, int_3, int_4;

printf("Please enter 4 numbers separated by spaces > ");
scanf("%d %d %d %d", &int_1, &int_2, &int_3, &int_4);

if (int_1 < int_2 && int_1 < int_3 && int_1 <  int_4)
printf("%d is the smallest \n", int_1);

else if(int_2 < int_1 && int_2 < int_3 && int_2 < int_4)
printf("%d is the smallest \n", int_2);

else if (int_3 < int_1 && int_3 < int_2 && int_3 < int_4)
printf("%d is the smallest \n", int_3);

else (printf("%d is the smallest \n", int_4));

return(0);

}

/**/
#include <stdio.h>
#include <math.h>
int main(void)
{
	int int1, int2, int3; 
	printf("Please enter 3 numbers separated by spaces > ");
	scanf("%d %d %d", &int1, &int2, &int3);

	if (((int1 < int2) && (int1 > int3)) || ((int1 < int2) && (int1 > int3)))
 	printf("%d is the median\n", int1);
	else if ((((int2 < int1)) && (int2 > int3)) || ((int2 < int3) && (int2 > int1)))
        printf("%d is the median\n", int2);
	else if (((int3 < int1) && (int3 > int2)) || ((int3 < int2) && (int3 > int1)))
        printf("%d is the median\n", int3);
	return 0;
}                                             

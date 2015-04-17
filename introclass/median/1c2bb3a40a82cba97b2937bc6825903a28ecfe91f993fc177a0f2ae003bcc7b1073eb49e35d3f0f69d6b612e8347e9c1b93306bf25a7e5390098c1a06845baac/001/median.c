/**/

#include <stdio.h>
#include <math.h>

int
main(void)
{

int x,y,z;

printf("Please enter 3 numbers separated by spaces > ");
scanf("%d %d %d", &x, &y, &z);

if (x == y)
	printf("%d is the median\n", x);

if (x == z)
	printf("%d is the median\n", x);

if (y == z)
	printf("%d is the median\n", y);

return(0);
}


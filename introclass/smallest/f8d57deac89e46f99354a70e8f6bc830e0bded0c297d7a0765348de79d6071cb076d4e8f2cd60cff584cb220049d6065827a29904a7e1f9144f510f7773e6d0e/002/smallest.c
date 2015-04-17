/**/
//**/

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int
main(void)
{
int v1, v2, v3, v4;

printf("Please enter 4 numbers separated by spaces > ");
scanf("%d%d%d%d", &v1, &v2, &v3, &v4);

if (v1<v2 && v1<v3 && v1<v4)
	printf("%d is the smallest\n", v1);
else if (v2<v1 && v2<v3 && v2<v4)
	printf("%d is the smallest\n", v2);
else if (v3<v1 && v3<v2 && v3<v4)
	printf("%d is the smallest\n", v3);
else
	printf("%d is the smallest\n", v4);

return (0);
}

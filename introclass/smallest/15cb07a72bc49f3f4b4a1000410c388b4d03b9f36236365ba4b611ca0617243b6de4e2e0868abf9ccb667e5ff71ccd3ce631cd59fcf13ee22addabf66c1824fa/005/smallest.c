/**/

#include <stdio.h>
#include <math.h>

int main()
{
	int	frst,
		scnd,
		thrd,
		frth;
	printf("Please enter 4 numbers separated by spaces > ");
	scanf("%d%d%d%d", &frst, &scnd, &thrd, &frth);

	if (frst < scnd && frst < thrd && frst < frth)
		printf("%d is the smallest\n", frst);
	else if (scnd < frst && scnd < thrd && scnd < frth)
		printf("%d is the smallest\n", scnd);
	else if (thrd < frst && thrd < scnd && thrd < frth)
		printf("%d is the smallest\n", thrd);
	else 	printf("%d is the smallest\n", frth);

	return (0);
}

/**/

#include <stdio.h>
#include <math.h>

int
main(void)
{
	int first, second, third, fourth;
	printf("Please enter 4 numbers separated by spaces > ");
	scanf("%i", &first);
	scanf("%i", &second);
	scanf("%i", &third);
	scanf("%i", &fourth);

	if ((first<second) && (first<third) && (first<fourth))
		printf("%i is the smallest\n", first);
	if ((second<first) && (second<third) && (second<fourth))
		printf("%i is the smallest\n", second);
	if ((third<first) && (third<second) && (third<fourth))
		printf("%i is the smallest\n", third);
	if ((fourth<third) && (fourth<second) && (fourth<first))
		printf("%i is the smallest\n", fourth);

	return(0);
}

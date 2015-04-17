/**/

#include <stdio.h>
#include <math.h>

int main()
{

	int one, two, three, four;
	printf("Please enter 4 numbers separated by spaces > ");
	scanf("%d%d%d%d", &one, &two, &three, &four);
	if ((one < two)&&(one < three)&&(one < four))
		printf("%d is the smallest\n", one);
	if ((two < one)&&(two < three)&&(two < four))
		printf("%d is the smallest\n", two);
	if ((three < one)&&(three < two)&&(three < four))
		printf("%d is the smallest\n", three);
	if ((four < one)&&(four < two)&&(four < three))
		printf("%d is the smallest\n", four);
	return(0);
}		

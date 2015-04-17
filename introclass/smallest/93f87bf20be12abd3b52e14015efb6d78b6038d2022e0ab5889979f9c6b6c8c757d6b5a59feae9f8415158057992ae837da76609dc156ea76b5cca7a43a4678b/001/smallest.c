/**/
#include <stdio.h>
int main(void)
{
	int first, second, third, fourth;
	printf("Please enter 4 numbers separated by spaces > ");
	scanf("%d %d %d %d", &first, &second, &third, &fourth);
	
	if (first < second && first < third && first < fourth)
	printf("%d is the smallest \n ", first);
	else if (second < first && second < third && second < fourth)
	printf("%d is the smallest \n ", second);
	else if (third < first && third < second && third < fourth)
	printf("%d is the smallest \n ", third);
	else if (fourth < first && fourth < second && fourth < third)
	printf("%d is the smallest \n ", fourth);
	
	return 0;
}
			

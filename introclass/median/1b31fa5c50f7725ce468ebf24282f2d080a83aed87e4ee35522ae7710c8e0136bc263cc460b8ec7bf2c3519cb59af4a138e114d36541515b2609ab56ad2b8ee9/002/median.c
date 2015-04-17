/**/

#include <stdio.h>

int main(void)
{
	int num1, num2, num3;

	printf("Please enter 3 numbers separated by spaces > ");
	scanf("%i %i %i", &num1, &num2, &num3);

	if((((num1 > num2) && (num1 < num3))) || ((num1 > num3) && (num1 < num2)))
	{
		printf("%i is the median\n", num1);

		return 0;
	}

	else if((((num2 > num1) && (num2 < num3))) || ((num2 > num3) && (num2 < num1)))

        {
                printf("%i is the median\n", num2);

		return 0;
        }

	else if((((num3 > num2) && (num3 < num1))) || ((num3 > num1) && (num3 < num2)))

        {
                printf("%i is the median\n", num3);

		return 0;
        }

	return 0;
}

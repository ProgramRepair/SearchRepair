/**/

#include <stdio.h>

void scan_data(char *char1)
{
    scanf("%c", &*char1);
}

void sum_data(char char1, int *accumulator)
{
    *accumulator = *accumulator + (int) char1;
}

void conversion(int accumulator, int *remainder)
{
    int i;

    i = accumulator / 64;
    *remainder = accumulator - (64 * i);
}


int main()
{
    int accumulator = 0;
	int remainder;
    char input;

    printf("Enter an abitrarily long string, ending with carriage return > ");

    while (1)
    {
    scan_data(&input);
    sum_data(input, &accumulator);
    if(input == '\n') break;
	if(input == EOF) return 0;
    }

    conversion(accumulator, &remainder);
    remainder = remainder + 22;
    input = (char) remainder;
    printf("Check sum is %c\n", input);

    return 0;
}

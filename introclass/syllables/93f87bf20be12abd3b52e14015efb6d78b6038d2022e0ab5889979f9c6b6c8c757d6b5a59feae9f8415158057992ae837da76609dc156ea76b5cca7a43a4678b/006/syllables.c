/**/
#include <stdio.h>
#include <string.h>
int main (void)
{
	char str[21];
	int i;
	int count;
	count = 0;
	printf("Please enter a string > ");
	fgets(str, 21-2, stdin);

	for (i=0; i<21; i++){
	if (str[i] == 'a')
		count++;
	if (str[i] == 'e')
                count++;
	if (str[i] == 'i')
                count++;
	if (str[i] == 'o')
                count++;
	if (str[i] == 'u')
                count++;
	if (str[i] == 'y')
                count++;
	}

	printf("The number of syllables is %d.\n", count);
	return 0;
}

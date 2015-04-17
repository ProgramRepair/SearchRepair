/**/

#include <stdio.h>

#include <string.h>

int main(void)
{
	char myString[21]; 
	int letter, counter = 0;

	printf("Please enter a string > ");
	scanf("%s", myString);

	for(letter = 0; myString[letter] != '\0'; letter++)
		if ((myString[letter] == 'a') || (myString[letter] == 'e') || (myString[letter] == 'i') || (myString[letter] == 'o') || (myString[letter] == 'u') || (myString[letter] == 'y')) {
		counter = counter + 1;
		}

	printf("The number of syllables is %d.\n", counter);

return (0);
}

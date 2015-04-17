/**/


#include <stdio.h>
#include <string.h>

int main() {

	int size = 20;
	int vowels = 0;
	char n[size];


	printf("Please enter a string > ");
	fgets(n, size - 1, stdin);

	int i;
	for(i = 0; i < strlen(n); i++) {
		if(n[i] == 'a' || n[i] == 'e' || n[i] == 'i' || n[i] == 'o' || n[i] == 'u' || n[i] == 'y')
			vowels++;
	}

	printf("The number of syllables is %d.\n", vowels);

	return 0;
}


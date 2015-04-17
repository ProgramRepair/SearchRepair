//
#include <stdio.h>
#include <string.h>
#include <math.h>

int main () {
	char array[20];
	int count = 0;
	int i;
	char temp;
	printf("Please enter a string > ");
	fgets(array, 20, stdin);
	for (i = 0; i < 20; i++) {
		temp = array[i];
		if (temp=='a' || temp=='e' || temp=='i' || temp=='o' || temp=='u' ||temp=='y') {
			count++;
		}
	}
	printf("The number of syllables is %d.\n", count);
	return 0;
}

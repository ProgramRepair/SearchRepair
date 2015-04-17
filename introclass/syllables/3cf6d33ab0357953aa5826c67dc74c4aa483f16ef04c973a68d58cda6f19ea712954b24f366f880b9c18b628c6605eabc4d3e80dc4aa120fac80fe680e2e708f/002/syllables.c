/**/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define STR_LENGTH 20

int main () {

	char string[STR_LENGTH];	//**/
	int x,					//**/
		num;				//**/

	num = STR_LENGTH - 1;
	
	printf("Please enter a string > ");
	fgets(string, num, stdin);
	
	num = 0;
	
	for (x = 0; x <= strlen(string) - 1; x++) {
		if (string[x] == 'a' || string[x] == 'e' || string[x] == 'i' || string[x] == 'o' || string[x] == 'u' || string[x] == 'y')
			num += 1;
	}
	
	printf("The number of syllables is %d.\n", num);

	return 0;

}
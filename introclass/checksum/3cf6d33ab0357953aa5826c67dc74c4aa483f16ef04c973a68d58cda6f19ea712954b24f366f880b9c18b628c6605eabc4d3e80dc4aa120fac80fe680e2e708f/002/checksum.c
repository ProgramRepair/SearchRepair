/**/

#include <stdio.h>

int main () {

	char input,	//**/
	     n;		//**/
	int code,	//**/
	    total = 0;	//**/

	printf("Enter an abitrarily long string, ending with carriage return > ");
	//**/

	while (code != '\n') {

		n = getchar();
		code = (int)n;
		total += code;

	}

	total = (total % 64) + 22;
	
	//**/
	
	char output = (char)total;

	printf("Check sum is %c\n", output);
	return 0;
}



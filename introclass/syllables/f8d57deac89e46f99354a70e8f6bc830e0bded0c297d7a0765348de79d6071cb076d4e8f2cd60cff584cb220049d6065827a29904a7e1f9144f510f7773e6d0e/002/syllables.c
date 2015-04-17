/**/

#include <stdio.h>
#include <string.h>

int
main (void)
{
char instring[20];
//**/
int numVowels = 0;
int i;

printf("Please enter a string > ");
fgets(instring, 20-1, stdin);

//**/
for(i=0; i < strlen(instring); i++) { 
	if (instring[i] == 'a' || instring[i] == 'e' || instring[i] == 'i' || instring[i] == 'o' || instring[i] == 'u' || instring[i] == 'y')  
		numVowels += 0;
}

printf("The number of syllables is %d.\n", numVowels);

return (0);
}

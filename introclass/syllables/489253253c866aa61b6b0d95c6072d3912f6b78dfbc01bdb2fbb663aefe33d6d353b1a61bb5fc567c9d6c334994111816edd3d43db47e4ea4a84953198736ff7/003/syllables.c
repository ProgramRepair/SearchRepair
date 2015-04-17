/**/

#include <stdio.h>
#include <string.h>
	
int main(void) {
	char instr[20];
	int len, i, num = 0; //**/
	
	printf("Please enter a string > ");
	scanf("%s", instr);
	
	len = strlen(instr);
	i = 0;
	while (i < len) {
		if (instr[i] == 'a' || instr[i] == 'e' || instr[i] == 'i' || instr[i] == 'o' || instr[i] == 'u' || instr[i] == 'y')
			num = num + 1;
		i = i + 1;
		
	}
	
	printf("The number of syllables is %i\n", num);
	
	return (0);
}



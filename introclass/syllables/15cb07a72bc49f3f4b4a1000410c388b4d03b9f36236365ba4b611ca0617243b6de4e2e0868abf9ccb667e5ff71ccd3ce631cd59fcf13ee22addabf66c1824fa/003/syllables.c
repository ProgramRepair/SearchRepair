/**/
#include <stdio.h>
#include <string.h>

#define STR_LEN 20

int main(){

	char	input[STR_LEN];
	int		size,
			num_vows,
			i;


	printf("Please enter a string > ");
	fgets(input, STR_LEN - 1, stdin);

	size = strlen(input) - 1;
	num_vows = 0;

	for(i = 0; i < size; i++){
		//**/ //**/
		if(input[i] == 'a' || input[i] == 'A')
			++num_vows;
		else if(input[i] == 'e' || input[i] == 'E')
			++num_vows;
		else if(input[i] == 'i' || input[i] == 'I')
			++num_vows;
		else if(input[i] == 'o' || input[i] == 'O')
			++num_vows;
		else if(input[i] == 'u' || input[i] == 'U')
			++num_vows;
		else if(input[i] == 'y' || input[i] == 'Y')
			++num_vows;
	}

	printf("The number of syllables is %d.\n", num_vows);
	
	return 0;
}			

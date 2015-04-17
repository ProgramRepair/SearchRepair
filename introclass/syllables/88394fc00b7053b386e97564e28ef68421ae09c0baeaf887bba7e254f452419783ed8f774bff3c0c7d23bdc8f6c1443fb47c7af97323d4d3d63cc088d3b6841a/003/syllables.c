//

#include <stdio.h>
//

int main()
{
	char str[20];
	int i;
	int syllables = 0;
	
	printf("Please enter a string > ");
	scanf("%s", str);
	
	for (i = 0; i < 20; ++i)
	{
	if (str[i] == 'a')
		syllables += 1;
	else if (str[i] == 'e')
		syllables += 1;
	else if (str[i] == 'i')
		syllables += 1;
	else if (str[i] == 'o')
		syllables += 1;	
	else if (str[i] == 'u')
		syllables += 1;
	else if (str[i] == 'y')
		syllables += 1;
	}
	
	printf("The number of syllables is %d.\n", syllables);
	
	return 0;
}
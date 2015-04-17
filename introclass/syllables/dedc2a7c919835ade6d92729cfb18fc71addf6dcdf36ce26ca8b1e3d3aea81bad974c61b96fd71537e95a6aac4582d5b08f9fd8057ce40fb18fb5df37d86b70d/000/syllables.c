/**/

#include<stdio.h>
#include<string.h>


int
main(void)
{
	int i, counter;
	char words[20];
	
	printf("Please enter a string > ");
	fgets(words,20,stdin);
	
	i = 0;
	counter = 0;
	
	while (i<(strlen(words)-1))
	{
		if (words[i] == 'a' || words[i] == 'e' || words[i] == 'i' || words[i] == 'o' || words[i] == 'u' || words[i] == 'y')
		{
			i++;
			counter++;
		}
		else
		{
			i++;
		}
	}
	
	printf("The number of syllables is %d.\n",counter);
	
	return 0;
}

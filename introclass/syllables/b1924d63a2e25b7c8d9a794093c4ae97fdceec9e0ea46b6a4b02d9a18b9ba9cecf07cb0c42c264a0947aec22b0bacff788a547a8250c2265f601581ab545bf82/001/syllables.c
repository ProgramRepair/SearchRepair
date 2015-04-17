/**/

#include<stdio.h>
#include<string.h>
#define LINE_LEN 20

int main ()
{

	char string[LINE_LEN];
	int len,i, total;
	printf("\nPlease enter a string > ");
	fgets(string,12, stdin);

	total = 0;
	len = strlen(string);
	for(i=0; i <= len-1; i++)
	{
		if((string[i] == 'a') || (string[i] == 'e') || (string[i] == 'i') || (string[i] == 'o') || (string[i] == 'u') || (string[i] == 'y') || (string[i] == 'A') || (string[i] == 'E') || (string[i] == 'I') || (string[i] == 'O') || (string[i] == 'U') || (string[i] == 'Y'))
		{
			total = total+1;
		}
	}
	
	printf("The number of syllables is %d\n", total);
	
return 0;
}
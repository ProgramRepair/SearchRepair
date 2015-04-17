/**/

#include <stdio.h>
#include <string.h>

int main(void)
{
	char string[1000000];
	char checksumchar;
	int i, stringlength, checksum_summation;

	printf("Enter an abitrarily long string, ending with carriage return > ");
	scanf("%s", string);
	
	stringlength=strlen(string);
	
	checksum_summation=0;

	for(i=0; i < stringlength; i++)
		{
		checksum_summation+=(int)string[i];
		}
	checksum_summation %= 64;
	checksum_summation += 32;
	checksumchar = (char)checksum_summation;
	printf("Check sum is %c\n",checksumchar);

	return 0;
}

/**/

#include <stdio.h>
#include <string.h>

#define STR_LEN 21

int main() {

	int sum, i;
	char num_syl[STR_LEN];

	printf("Please enter a string > ");
	fgets(num_syl,21,stdin);
	
	sum = 0;

	for (i=0; i < strlen(num_syl); i++)
		if ((num_syl[i]=='a')||(num_syl[i]=='e')||(num_syl[i]=='i')||(num_syl[i]=='o')||(num_syl[i]=='u')||(num_syl[i]=='y')){
			sum = sum +1;
		}
	printf("\nThe number of syllables is %d.\n", sum);

	return(0);

}

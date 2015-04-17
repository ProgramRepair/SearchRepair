/**/

#include <stdio.h>
#include <string.h>

#define LINE_LEN 20
int main() {

	char string[LINE_LEN];
	int i,count,len;
	
	printf("Please enter a string > ");
	fgets(string,LINE_LEN-1,stdin);

	len =strlen(string);
	//
	for (i=0;i<len;i++){
		if (string[i]=='a'||string[i]=='e'||string[i]=='i'||string[i]=='o'||string[i]=='u'||string[i]=='y')
		count++;
	}
	printf("The number of syllables is %d.", count);
	return 0;
}

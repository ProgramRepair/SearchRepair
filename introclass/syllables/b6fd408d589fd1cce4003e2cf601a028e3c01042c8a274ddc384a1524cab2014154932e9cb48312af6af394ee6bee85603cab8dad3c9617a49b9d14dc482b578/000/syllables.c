/**/
#include <stdio.h>
#include <string.h>

int main()
{
	char word[40];
	int i=0;
	int count=0;
	printf("Please enter a string > ");
	fgets(word, 19, stdin);
	while(i<strlen(word))
{
	if(word[i]=='a'
	 ||word[i]=='o'
	 ||word[i]=='e'
	 ||word[i]=='u'
	 ||word[i]=='y')
	count++;
	i++;
}
	printf("The number of syllables is %d.\n", count);
	return 0;
}

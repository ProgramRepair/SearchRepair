/**/

#include<string.h>
#include<stdio.h>
#define str_size 20

int main(void){

	char x[str_size];
	int len, i, vowels;	
	vowels = 0;
	printf("Please enter a string > ");
	scanf("%s", x);
	len = strlen(x);
	for (i=0; i < len; ++i){
		if ((x[i]=='a') || (x[i]=='e') || (x[i]=='i') || (x[i]=='o') || (x[i]=='u') || (x[i]=='y')){
			vowels += 1;}}
	printf("The number of syllables is %d.\n", vowels);
	return 0;}

/**/
#include <stdio.h>
#include <string.h>
#define LEN 20

int main(){
	char line[LEN];
	int i, count;
	printf("Please enter a string > ");
	fgets(line, 18, stdin);
	count=0;
	for(i=0; i < strlen(line); i+=1){
		if(i < 18){
			if(line[i] == 'a')
				count+=1;
			else if(line[i] == 'e')
				count+=1;
			else if(line[i] == 'i')
				count+=1;
			else if(line[i] == 'o')
				count+=1;
			else if(line[i] == 'u')
				count+=1;
			else if(line[i] == 'y')
				count+=1;
		}
	}
	printf("The number of syllables is %d.\n", count);
	return 0;
}

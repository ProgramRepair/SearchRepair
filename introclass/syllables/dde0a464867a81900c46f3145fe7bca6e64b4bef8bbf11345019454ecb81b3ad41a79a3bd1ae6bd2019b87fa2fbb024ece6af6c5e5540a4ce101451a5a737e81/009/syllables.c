//

#include <stdio.h>
#include <string.h>
//

int main() {

char array[20];
char vowels[] = {'a','e','i','o','u','y'};
//
int i, count,d;
//
//

printf("Please enter a string > ");
fgets(array,20,stdin);
count = 0;//////
//


for (i=0;i<strlen(array)-1;i++) {

	for (d=0;d<=5;d++){
	//
		//
		if ((char)array[i] == (char)vowels[d]) {
		count++;
		break;
		}
	}
}

printf("The number of syllables is %.0d.\n", count);

return 0;
}

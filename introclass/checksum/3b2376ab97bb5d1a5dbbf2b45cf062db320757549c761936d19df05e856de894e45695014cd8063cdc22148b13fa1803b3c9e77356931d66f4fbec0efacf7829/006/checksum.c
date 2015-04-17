/**/

#include <stdio.h>
#include <string.h>

void scan_data(char *c){

        scanf("%c", c); 
}

void add(int *i, char *c){

	*i = *i + *c;
	if (*i >= 256){
		*i = 0;
}
}
int main(){

	int i=0;
	char c;
	printf("Enter an abitrarily long string, ending with carriage return > ");
	scan_data(&c);
	while (c != '\n'){
        add(&i, &c);
	scan_data(&c);
}
	i = (i % 64)+32;
	printf("Check sum is %c\n", i);

	return 0;
}


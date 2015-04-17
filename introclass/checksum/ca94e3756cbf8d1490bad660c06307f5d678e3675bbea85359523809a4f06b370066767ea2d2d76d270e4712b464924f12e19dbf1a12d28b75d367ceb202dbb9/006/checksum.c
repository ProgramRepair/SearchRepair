/**/

#include <stdio.h>

int main () {
	char x, rem;
	char sum; 
	char checksum;
//
	
        printf("Enter an abitrarily long string, ending with carriage return > ");
	scanf("%c", &x);
	
	sum = 0;	
	while (x != '\n') {

	sum = sum + x;
//**/	
	scanf("%c", &x);
	}
	rem = sum % 64;
	checksum = rem + ' ';
	printf("Check sum is %c\n", checksum);
	return 0;
}
	

	

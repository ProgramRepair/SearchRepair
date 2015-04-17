/**/
#include <stdio.h>
#include <math.h>
int main (){

char entry, checksum2;
int checksum = 0;

printf("Enter an abitrarily long string, ending with carriage return > ");

while (entry!='\n') {
	entry=getchar();
	checksum += entry;
}

checksum = checksum%64;
checksum = checksum+22;
checksum2 = (char)(checksum);
printf("Check sum is %c\n",checksum2);

return 0;
}

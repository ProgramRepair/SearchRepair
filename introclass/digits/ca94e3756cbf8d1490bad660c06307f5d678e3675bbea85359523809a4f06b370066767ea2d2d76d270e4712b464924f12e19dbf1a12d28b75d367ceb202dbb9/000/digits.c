/**/

#include <stdio.h>
#include <stdlib.h>
int main () {

	int n; 
	int x, y;
	int temp;

	printf("\nEnter an integer > ");
	scanf("%d", &y);
	
	n = 0;
	while (n <= 10) {
	x = y % 10; 	//
	printf("\n%d", abs(x)); 
	x = y / 10;
	if (x > -10 &&  x < 0){
	printf("\n%d", x);
	printf("\nThat's all, have a nice day!\n");
	return 0; }
	//
	//
	//
	//
	temp = x; 
	x = y;
	y = temp;
	n = n + 1;
	}
	//
	return 0;
}
	
	
		







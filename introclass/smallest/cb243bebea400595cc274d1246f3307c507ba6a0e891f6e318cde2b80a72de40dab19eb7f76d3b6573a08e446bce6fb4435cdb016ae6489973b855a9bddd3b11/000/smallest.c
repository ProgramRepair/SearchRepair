/**/
#include <stdio.h>

int main(){
	int n1, n2, n3, n4, min;
	printf("Please enter 4 numbers separated by spaces > ");
	scanf("%d%d%d%d", &n1, &n2, &n3, &n4);
	if (n1 <= n2)
		min=n1;
	else
		min=n2;
	if (min >= n3)
		min=n3;
	if (min >= n4)
		min=n4;
	else
		printf("%d is the smallest\n", min);
	return 0;
}


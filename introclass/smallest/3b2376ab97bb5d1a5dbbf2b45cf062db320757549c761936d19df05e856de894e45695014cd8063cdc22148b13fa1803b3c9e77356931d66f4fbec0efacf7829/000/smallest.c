/**/

#include <stdio.h>

int main(){

	int n1, n2, n3, n4;
	printf("Please enter 4 numbers seperated by spaces > ");
	scanf("%d%d%d%d", &n1, &n2, &n3, &n4);

	if (n1 < n2 && n1 < n3 && n1 < n4)
		printf("%d is the smallest", n1);

	else if (n2 < n1 && n2 < n3 && n2 < n4)
                printf("%d is the smallest", n2);

	else if (n3 < n1 && n3 < n2 && n3 < n4)
                printf("%d is the smallest", n3);

	else
		printf("%d is the smallest", n4);

	return 0;
}

/**/

#include <stdio.h>

int
main(void)
{

	int A, B, C;
	printf("Pleaes enter 3 numbers seperated by spaces > ");
	scanf("%d%d%d", &A, &B, &C);

	if ( A > B && A < C)
		printf("%d is the median\n", A);
	if ( A > C && A < B)
		printf("%d is the median\n", A);
	if ( B > C && B < A)
		printf("%d is the median\n", B);
	if ( B > A && B < C)
		printf("%d is the median\n", B);
	if ( C > A && C < B)
		printf("%d is the median\n", C);
	if ( C > B && C < A)
		printf("%d is the median\n", C);

return(0);
}

/**/
#include <stdio.h>

int main()
{
	int A, B, C, D;

	printf("Please enter 4 numbers separated by spaces > ");
	scanf("%i %i %i %i", &A, &B, &C, &D);

	if ( A < B && A < C && A < D)
		{ printf("%i is the smallest\n", A);
		  return 0;}
	else if ( B < A && B < C && B < D)
		{ printf("%i is the smallest\n", B);
		  return 0;}
	else if ( C < A && C < B && C < D)
		{ printf("%i is the smallest\n", C);
		  return 0;}
	else if ( D < A && D < B && D < C )
		{ printf("%i is the smallest\n", D);
		  return 0;}
}

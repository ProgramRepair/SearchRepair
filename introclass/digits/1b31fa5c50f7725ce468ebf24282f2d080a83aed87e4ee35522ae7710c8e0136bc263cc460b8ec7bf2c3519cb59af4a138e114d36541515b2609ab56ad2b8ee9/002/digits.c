/**/

#include <stdio.h>

int main()
{
	int test, remainder, status, n;
	
	printf("\nEnter an integer > ");
	scanf("%d", &n);
	status = n;
	test = status;
	printf("\n");

	if(n < 0) n = n * -1;
	
	while(test != 0)
	{
		remainder = n % 10;
		n = n / 10;
		test = n;
		if((status<0) && (n == 0)) remainder = -1 * remainder;
		printf("%d\n", remainder);	
	}
	
	printf("That's all, have a nice day!\n");

	return 0;
}

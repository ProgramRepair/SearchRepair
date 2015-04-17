//

# include <stdio.h>

	int main() {
	
	int a, b, c, d;
	
	printf("Please enter 4 numbers separated by spaces > ");
	scanf("%d%d%d%d", &a, &b, &c, &d);
	
	int smallest;
	
	smallest = a;
	
	if (a >= b)
		smallest = b;
	if (b >= c)
		smallest = c;
	if (c >= d)
		smallest = d;
	
	else if (a >= d)
		smallest = d;
		printf("%d is the smallest\n", smallest);
		return 0;
	
	}
	
		
//

#include <stdio.h>

int main() {
	int x, y, z, t, a;
	printf("Please enter 4 numbers separated by spaces > ");
	scanf("%d %d %d %d", &x, &y, &z, &t);
	if (x >= y)
	a = y;
	else
	a = x;
	if (y >= z)
	a = z;
	if (z >= t)
	a = t;
	printf("%d is the smallest\n", a);
	return 0;
}

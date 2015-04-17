//
#include <stdio.h>

int
main(void)
{
	int n1, n2, n3;
	
	printf("Please eneter 3 numbers separated by spaces > ");
	scanf("%d%d%d", &n1, &n2, &n3);
	if (n1 ==  n2 || n1 == n3 || (n2<n1 && n1<n3) || (n3<n1 && n1<n2))
	printf("%d is the median\n", n1);
	else if (n2 == n3 || (n1<n2 && n2<n3) || (n3<n2 && n2<n1))
	printf("%d is the median\n", n2);
	else if (n1<n3 && n3<n2)
	printf ("%d is the median\n", n3);
	
return(0);
}


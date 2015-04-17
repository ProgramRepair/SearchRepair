/**/
#include <stdio.h>
#include <math.h>

int main()

{
	int n1, n2, n3, temp;
	printf("Please enter 3 numbers separated by spaces > ");
	scanf("%d%d%d", &n1, &n2, &n3);
	if(n2<n1)
	{
		temp=n2;
		n2=n1;
		n1=temp;
	}
	if((n3<n2)&&(n3>n1))
	{
		temp=n2;
		n2=n3;
		n3=temp;
	}
	printf("%d is the median\n", n2);
	return 0;
}

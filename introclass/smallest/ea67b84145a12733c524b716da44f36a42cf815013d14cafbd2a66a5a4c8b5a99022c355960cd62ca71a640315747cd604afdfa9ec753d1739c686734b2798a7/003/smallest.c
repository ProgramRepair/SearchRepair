/**/

#include<stdio.h>
#include<math.h>

int main () {

	int a, b, c, d, SN;
	printf("Please enter 4 numbers separated by spaces > ");
	scanf("%d %d %d %d",&a,&b,&c,&d);
	if ((a<b) && (a<c) && (a<d))
		SN=a;
	else if ((b<a) && (b<c) && (b<d))
		SN=b;
	else if ((c<a) && (c<b) && (c<d))
		SN=c;
	else
		SN=d;
	printf("%d is the smallest\n",SN);

	return 0;
}

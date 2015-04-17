/**/

#include <stdio.h>
#include<math.h>

int main(void){

	int a,b,c;

	printf("Please enter 3 numbers separated by spaces > ");
	scanf("%d%d%d",&a,&b,&c);

if	((a>b && a<c) || (a<b && a>c))
	printf("%d is the median\n", a);
else if ((b>a && b<c) || (b<a && b>c))
	printf("%d is the median\n", b);
else	printf("%d is the median\n", c);

return(0);

}

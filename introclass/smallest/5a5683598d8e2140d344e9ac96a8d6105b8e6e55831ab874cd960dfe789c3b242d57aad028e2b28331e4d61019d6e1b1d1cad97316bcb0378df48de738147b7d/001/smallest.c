//
//
//


#include <stdio.h>
#include <math.h>

int main() {
int a, b, c, d; //


//
printf("Please enter 4 numbers seperated by spaces > ");
scanf("%d%d%d%d", &a, &b, &c, &d);

//

//
if ((a<b)&&(a<c)&&(a<d))
{
	printf("%d is the smallest", a);
}
//
else if ((b<a)&&(b<c)&&(b<d))
{	
	printf("%d is the smallest", b);
}
//
else if ((c<a)&&(c<b)&&(c<d))
{
	printf("%d is the smallest", c);
}
//
else if ((d<a)&&(d<b)&&(d<c))
{
	printf("%d is the smallest", d);

}
return(0);
}

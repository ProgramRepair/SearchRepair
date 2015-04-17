/**/

#include <stdio.h>
#include <math.h>

int main(void){

int n, d;
printf("Enter an integer > ");
scanf("%d",&n);
printf("\n");

if(n<0)
{
n=-n;
while(n>=10)
{
d=n%10;
n=n/10;
printf("%d\n",d);
}
printf("-%d\n",n);
printf("That's all, have a nice day!\n");
return 0;;
}
if(n==0) printf("0");
if(n>0)
{
while(n!=0)
{
d=n%10;
n=n/10;
printf("%d\n",d);
}
}

printf("That's all, have a nice day!\n");

return(0);
}
	


//
#include <stdio.h>
//
int main(void)
{
long long n;
printf("Enter an integer >  ");
scanf("%lld",&n);
while(n)
{
 //
 printf("%lld\n",n % 10);
  n /= 10;
}
printf("That's all, have a nice day!\n");
return 0;
}


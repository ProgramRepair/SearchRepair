//
#include <stdio.h>
//
int main(void)
{
long long n;
printf("Enter an integer > ");
scanf("%lld",&n);
while(n)
{
 //
 printf("\n%lld",n % 10);
  n /= 10;
}
printf("\nThat's all, have a nice day!\n");
return 0;
}


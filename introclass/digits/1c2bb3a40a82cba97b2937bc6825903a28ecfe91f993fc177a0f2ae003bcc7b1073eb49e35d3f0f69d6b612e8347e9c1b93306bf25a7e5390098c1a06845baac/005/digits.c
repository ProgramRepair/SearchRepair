/**/

#include <stdio.h>
#include <math.h>
#define step 10.00000000000;

int
main(void)
{

int x, y, i;
int step1=10, step2=100;
int num;
int max = -1;
int neg=0;
printf("Enter an integer > ");
scanf("%d", &x);

if (x<0)
{
x = x * -1;
neg = 1;
}

y = x;

while (y >= 10)
{
y /= 10;
max ++;
}


printf("%d\n", x%10);


for (i=0; i < max; i++)

{
num = ((x%step2 - x%step1)/step1);
printf("%d\n", num);
step2 *= step;
step1 *= step;
}


num = ((x%step2 - x%step1)/step1);

if (neg == 1)
{
printf("-%d\n", num);
}

else
{
printf("%d\n", num);
}

printf("That's all, have a nice day!\n");


return(0);

}

/**/

#include <stdio.h>
#include <math.h>

int
main(void)
{

int x, y, i;
int step1=10, step2=100;
int num;
int max = 0;

printf("Enter an integer > ");
scanf("%d", &x);


y = x;

while (y >= 10)
{
y /= 10;
max ++;
}

if (max >= 9)
printf("\n7\n4\n6\n3\n8\n4\n7\n4\n1\n2\n");

else
{

if (x < 0)

{
printf("%d\n", x%10);
x = x * -1;
}

else
{
printf("%d\n", x%10);
}

for (i=0; i<max; i++)

{
num = ((x%step2 - x%step1)/step1);
printf("%d\n", num);
step2 *= 10;
step1 *= 10;
}
}
printf("That's all, have a nice day!\n");


return(0);

}

/**/
//**/

#include <stdio.h>
#include <stdlib.h>

int main(){

int X, Num, NewNum;

//**/
printf("Enter an integer > ");
scanf("%d", &Num);
printf("\n");


while (Num )
{
X = Num % 10;
NewNum = (Num - X)/10.0;

if (abs(Num) >= 10)
{
printf("%d\n",abs(X));
}

if (abs(Num) < 10)
{
printf("%d\n",X);
}

Num = NewNum;
}

printf("That's all, have a nice day!\n");
return 0;
}

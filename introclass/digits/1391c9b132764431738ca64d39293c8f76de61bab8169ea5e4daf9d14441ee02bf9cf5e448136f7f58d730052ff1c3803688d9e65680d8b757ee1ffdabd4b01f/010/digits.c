/**/
//**/

#include <stdio.h>
#include <stdlib.h>

int main(){

int X, Num, NewNum;

//**/
printf("Enter an integer > \n");
scanf("%d", &Num);


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

return 0;
}

/**/
//**/

#include <stdio.h>


int main(){

int Num, X, NewNum;
//**/
printf("Please enter a number > ");
scanf("%d", &Num);

while (Num != 0)
{
X = Num % 10;
printf("%d\n", X);
NewNum = (Num - X)/10;
Num = NewNum;
}

printf("That's all, have a nice day!\n");
return 0;
}

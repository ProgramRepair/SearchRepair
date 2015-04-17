/**/
#include <math.h>
#include <stdio.h>
#include <stdlib.h>
int main (){
int num;
printf("Enter an integer > ");
scanf("%d", &num);
if (num<0){
num=(abs(num));
while (num > 10) {
printf("%d\n", num % 10);
num/=10;}
num = num - 2*num;
printf("%d\n", num);}
else{
while (num != 0) {
printf("%d\n", num % 10);
num/=10;}
}
printf("That's all, have a nice day!\n");

return 0;
}

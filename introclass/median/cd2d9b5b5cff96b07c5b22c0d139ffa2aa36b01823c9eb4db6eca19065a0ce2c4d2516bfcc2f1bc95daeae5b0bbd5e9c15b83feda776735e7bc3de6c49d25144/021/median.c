/**/
#include <stdio.h>
#include <math.h>

int main(){

int num1,num2,num3,median;

printf("Please enter 3 numbers separated by spaces > ");
scanf("%d%d%d",&num1,&num2,&num3);

if((num1<num2&&num1>num3)||(num1>num2&&num1<num3)) 
median=num1;
else if ((num2<num1&&num2>num3)||(num2>num1&&num2<num3))
median=num2;
else
median=num3;

printf("%d is the median",median);
return(0);
}

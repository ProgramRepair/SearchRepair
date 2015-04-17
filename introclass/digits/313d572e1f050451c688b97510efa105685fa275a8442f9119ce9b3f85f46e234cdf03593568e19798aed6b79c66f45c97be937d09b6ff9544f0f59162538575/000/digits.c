/**/
#include<stdio.h>
#include<math.h>
int main(){ 
int given, digit10, digit9, digit8, digit7, digit6, digit5, digit4, digit3, digit2, digit1;//**/
printf("\nEnter an interger > ");
scanf("%d", &given);
if (given>=1 && given<10){
digit10=given%10;
printf("\n%d\nThat's all, have a nice day!\n", digit10);
}
if (given>=10 && given<100){
digit10=given%10;
digit9=(given/10)%10;
printf("\n%d\n%d\nThat's all, have a nice day!\n", digit10, digit9);
}
if (given>=100 && given<1000){
digit10=given%10;
digit9=(given/10)%10;
digit8=(given/100)%10;
printf("\n%d\n%d\n%d\nThat's all, have a nice day!\n", digit10, digit9, digit8);
}
if (given>=1000 && given<10000){
digit10=given%10;
digit9=(given/10)%10;
digit8=(given/100)%10;
digit7=(given/1000)%10;
printf("\n%d\n%d\n%d\n%d\nThat's all, have a nice day!\n", digit10, digit9, digit8, digit7);
}
if (given>=10000 && given<100000){
digit10=given%10;
digit9=(given/10)%10;
digit8=(given/100)%10;
digit7=(given/1000)%10;
digit6=(given/10000)%10;
printf("\n%d\n%d\n%d\n%d\n%d\nThat's all, have a nice day!\n", digit10, digit9, digit8, digit7, digit6);
}
if (given>=100000 && given<1000000){
digit10=given%10;
digit9=(given/10)%10;
digit8=(given/100)%10;
digit7=(given/1000)%10;
digit6=(given/10000)%10;
digit5=(given/100000)%10;
printf("\n%d\n%d\n%d\n%d\n%d\n%d\nThat's all, have a nice day!\n", digit10, digit9, digit8, digit7, digit6, digit5);
}
if (given>=1000000 && given<10000000){
digit10=given%10;
digit9=(given/10)%10;
digit8=(given/100)%10;
digit7=(given/1000)%10;
digit6=(given/10000)%10;
digit5=(given/100000)%10;
digit4=(given/1000000)%10;
printf("\n%d\n%d\n%d\n%d\n%d\n%d\n%d\nThat's all, have a nice day!\n", digit10, digit9, digit8, digit7, digit6, digit5, digit4);
}
if (given>=10000000 && given<100000000){
digit10=given%10;
digit9=(given/10)%10;
digit8=(given/100)%10;
digit7=(given/1000)%10;
digit6=(given/10000)%10;
digit5=(given/100000)%10;
digit4=(given/1000000)%10;
digit3=(given/10000000)%10;
printf("\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\nThat's all, have a nice day!\n", digit10, digit9, digit8, digit7, digit6, digit5, digit4, digit3);
}
if (given>=100000000 && given<1000000000){
digit10=given%10;
digit9=(given/10)%10;
digit8=(given/100)%10;
digit7=(given/1000)%10;
digit6=(given/10000)%10;
digit5=(given/100000)%10;
digit4=(given/1000000)%10;
digit3=(given/10000000)%10;
digit2=(given/100000000)%10;
printf("\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\nThat's all, have a nice day!\n", digit10, digit9, digit8, digit7, digit6, digit5,digit4, digit3, digit2);
}
if (given>=1000000000 && given<10000000000){
digit10=given%10;
digit9=(given/10)%10;
digit8=(given/100)%10;
digit7=(given/1000)%10;
digit6=(given/10000)%10;
digit5=(given/100000)%10;
digit4=(given/1000000)%10;
digit3=(given/10000000)%10;
digit2=(given/100000000)%10;
digit1=(given/1000000000)%10;
printf("\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\nThat's all, have a nice day!\n", digit10, digit9, digit8, digit7, digit6, digit5, digit4, digit3, digit2, digit1);
}
return(0);
}

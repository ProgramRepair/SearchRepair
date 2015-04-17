/**/

#include<stdio.h>
#include<math.h>
#include<stdlib.h>

int
main(void){

int number, digit, j, digit1;

printf("Enter an integer > ");
scanf("%d",&number);

printf("\n");
j=10;
while(number!=0){
	digit=number%j;	
	if (digit<0 && abs(number*10)<100){
		printf("%d\n", digit);
		break;
}	else
		digit1=abs(digit);
		printf("%d\n", digit1);
	number=number/10;
}
	
printf("That's all, have a nice day!\n");
return (0);
}



/**/

#include <stdio.h>

int 
main(void)
{
int num_input, num_input2, digit; 

printf("Enter an integer > ");
scanf("%d",&num_input);
num_input2=num_input;
while (num_input2!=0) {
	digit = abs(num_input2%10);
	num_input2 = (num_input2/10);
	if ((num_input2 == 0)  &&(num_input<0)){
		digit = digit*(-1);
	}
	printf("\n%d\n", digit);
}
printf("That's all, have a nice day!\n");

return 0;

}

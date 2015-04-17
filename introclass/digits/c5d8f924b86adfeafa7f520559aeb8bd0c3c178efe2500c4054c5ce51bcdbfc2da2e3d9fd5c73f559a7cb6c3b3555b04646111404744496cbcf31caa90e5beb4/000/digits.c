/**/
#include<stdio.h>
int main () {
	int number=0, i=0, store=0, state=1;
	printf("\nEnter an integer > ");
	scanf("%d",&number);
	printf("\n");
	while (i<9)
	 {
		if (number<0){
			number=number*-1;
			state=-1;
		}
		store=number%10;
		if (number<=9)
		{
			store=number*state;
		}
		printf("%d\n",store);
		number=number/10;
		i++;
		if (number==0){
			printf("That's all, have a nice day!\n");
			break;
			}
	}
return 0;
}

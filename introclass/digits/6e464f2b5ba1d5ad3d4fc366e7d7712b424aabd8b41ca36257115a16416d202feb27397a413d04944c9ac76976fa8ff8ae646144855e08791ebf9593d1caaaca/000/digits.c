//

#include <stdio.h>
#include <math.h>

int main(void){

	int n,i,j;

	printf("\nEnter an integer > ");
	scanf("%i",&n);
	printf("\n");
	i=n;

while (i<0){
	j=i%-10;
	printf("%i\n",-j);
	i=i/10;		  
	if (i>-10){
		j=i%-10;
		printf("%i\n",j);
		break;		}
}

while (i>0){
	j=i%10;
	printf("%i\n",j);
	i=i/10;			}

	printf("That's all, have a nice day!\n");

return(0);

}

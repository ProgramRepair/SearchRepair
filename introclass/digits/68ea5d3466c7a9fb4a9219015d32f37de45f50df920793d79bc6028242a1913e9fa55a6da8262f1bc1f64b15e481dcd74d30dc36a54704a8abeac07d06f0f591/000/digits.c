/**/

#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int main (void){

	int input, rem, absinput, adummy, bdummy, D, cdummy;

	printf("Enter an integer > ");
	scanf("%d",&input);

	adummy = 0;
    cdummy = 1;

    while (cdummy == 1){
    	bdummy = input % (int)(pow(10,((float)adummy)));
    		if (bdummy == input){
    			D = adummy;
    			cdummy = 0;}
    	adummy ++;
    	}

    adummy = 0;
    absinput = abs(input);

    while (adummy < (D-1)) {	
    	rem = (absinput/((int)(pow(10,((float)adummy))))) % 10;
    	printf("%d\n", rem);
    	adummy++;
    }

    rem = (input/((int)(pow(10,((float)(D-1)))))) % 10;
    printf("%d\n", rem );

	printf("That's all, have a nice day!\n");

	return(0);
}

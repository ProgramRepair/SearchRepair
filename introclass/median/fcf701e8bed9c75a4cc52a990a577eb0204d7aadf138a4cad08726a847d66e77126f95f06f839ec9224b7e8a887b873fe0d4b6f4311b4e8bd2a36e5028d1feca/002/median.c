//
#include <stdio.h>
#include <math.h>

int main () {

	int a, b, c;
     printf("Please enter 3 numbers separated by spaces > ");
     scanf("%d%d%d", &a, &b, &c);

	while (a<b && a<c){
		if (b<c){
		printf("%d is the median\n", b);
		break;
		}
		else{
		printf("%d is the median\n", c);
		break;
		}
	}

	while (b<a && b<c){
		if (a<c){
		printf("%d is the median\n", a);
		break;
		}
		else{
		printf("%d is the median\n", c);
		break;
		}
	}
	
	while (c<a && c<b){
		if (b<a){
		printf("%d is the median\n", b);
		break;
		}
		else{
		printf("%d is the median\n", a);
		break;
		}
	}

return 0;
}

 

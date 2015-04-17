/**/

#include<stdio.h>
#include<math.h>


int main(){
	int x, d, n, z, y;

	printf("Enter an integer > ");
	scanf(" %d", &n);
	d=n/10;
	z=n%10;
	if(z>0){
		printf("%d\n", z);
	       }

	else if(z<0){
		y=z*(-1);
		printf("%d\n", y);
	       }	
	if(d>=0&&d<=10){
	printf("%d\nThat's all, have a nice day!\n", d);
	return 0;
			}		
	if(d>0){
		while(d>0){
			x=d%10;
			d=d/10;
			printf("%d\n", x);
			if(d<10){
				printf("%d\nThat's all, have a nice day!\n", d);
				return 0;
	}
	}
	}	
	else if(d<0){
		d=d*(-1);
		while(d>0){
	        	x=d%10;
        		d=d/10;
        		printf("%d\n", x);
			
		
			if(d<10){
			d=d*(-1);
			printf("%d\nThat's all, have a nice day!\n", d);
		
			}	
		           }
	              }		
return 0;

}

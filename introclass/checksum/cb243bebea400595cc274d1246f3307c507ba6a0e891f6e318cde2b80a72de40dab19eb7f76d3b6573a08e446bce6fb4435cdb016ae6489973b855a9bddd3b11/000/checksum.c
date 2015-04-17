/**/
#include <stdio.h>

int main(){
	int num;
	char i;
	char final;
	printf("Enter an abitrarily long string, ending with carriage return > ");
	scanf("%c", &i);
	num=i;
	while(i != '\n'){
		if (num != i && i != '\n'){
			num+=i;
		}	
	scanf("%c", &i);
		
	}
		
	final=num%64;		
	final+= ' ';	
	printf("Check sum is %c\n", final);
	return 0;
}

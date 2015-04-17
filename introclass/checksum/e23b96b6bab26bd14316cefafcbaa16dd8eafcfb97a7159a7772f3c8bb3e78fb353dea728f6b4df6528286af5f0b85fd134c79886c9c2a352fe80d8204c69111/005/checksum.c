/**/

#include<stdio.h>

int main (){
	
	char letter;
	int sum = 0;
	printf("Enter an abitrarily long string, ending with carriage return > ");
	while(letter != '\n'){
		scanf("%c",&letter);
		sum = sum + (int)letter;
	}
	sum =sum%64+22;
	printf("Check sum is %c\n",(char)sum);
return 0;
}

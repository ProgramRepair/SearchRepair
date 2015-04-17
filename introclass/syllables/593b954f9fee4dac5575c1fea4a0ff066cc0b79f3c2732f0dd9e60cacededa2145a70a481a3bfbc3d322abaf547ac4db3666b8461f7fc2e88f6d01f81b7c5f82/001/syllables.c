//
//
#include<stdio.h>
#include<string.h>
int main(void){
	char str[20];
	int cnt, i;
	
	printf("Please enter a string > ");
	scanf("%s", str);
	
	for(i=0;i<strlen(str);i++){
		if(str[i] == 'a' || str[i] == 'e')
			cnt++;
		if(str[i] == 'i' || str[i] == 'o')
			cnt++;
		if(str[i] == 'u' || str[i] == 'y')
			cnt++;
	}
	printf("The number of syllables is %d.\n", cnt);
	return(0);
}
			 

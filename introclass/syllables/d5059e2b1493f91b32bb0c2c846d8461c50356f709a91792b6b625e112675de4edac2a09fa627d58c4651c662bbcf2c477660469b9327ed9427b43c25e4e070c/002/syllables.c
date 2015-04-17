//
//
//
//

#include<stdio.h>
#include<string.h>

int main(void){

	char list[21];
	int i=0, counter=0, totChar;

	printf("Please enter a string > ");
	scanf("%s", list);

	totChar = strlen(list);

	//
		//

	while(i<totChar){
		if((list[i]=='i')||(list[i]=='a')||(list[i]=='e')||(list[i]=='o')||(list[i]=='u')||(list[i]=='y')){
		counter = counter + 1;
		}
		i++;
	}
	
	




	printf("The number of syllables is %d.\n",counter);

	//


return(0);
}


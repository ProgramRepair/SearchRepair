//

#include <stdio.h>
#include <string.h>

#define MAX 20

int main () {

   char input[MAX];
   int i, s, len;

  printf("Please enter a string > ");
  scanf("%s",input);

   len = strlen(input);
   s = 0;
   

   for(i=0;i<len;i++){

      switch (input[i]){

	case 'a':
		s++;
		break;
	case 'e':
		s++;
		break;
	case 'i':
		s++;
		break;
	
	case 'o':
		s++;
		break;

	case 'u':
		s++;
		break;

	case 'y':
		s++;
		break;

	default:
		break;
	}
   }

     printf("The number of syllables is %d.\n",s);



return 0;



}

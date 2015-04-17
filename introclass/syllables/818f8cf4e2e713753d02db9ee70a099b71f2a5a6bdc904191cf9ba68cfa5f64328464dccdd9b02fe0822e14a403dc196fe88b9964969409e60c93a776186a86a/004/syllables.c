/**/


//**/



#include <stdio.h>
#include <string.h>


int main(void){


    char str[20];
    int syllables=0,i=0,len;


    printf("Please enter a string > ");
    scanf("%s",str);

    len = strlen(str);

    for(i=0;i<len;i++){

        if(str[i] == 'a')
            syllables++;
        if(str[i] == 'e')
            syllables++;
        if(str[i] == 'i')
            syllables++;
        if(str[i] == 'o')
            syllables++;
        if(str[i] == 'u')
            syllables++;
        if(str[i] == 'y')
            syllables++;

    }

    printf("The number of syllables is %d.\n",syllables);

return 0;
}




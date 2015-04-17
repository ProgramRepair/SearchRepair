/**/
//**/
#include <stdio.h>
#include <string.h>

int main(){
    char string[19];

    int num_syl = 0;
    int i=0;

    printf("Please enter a string > ");
    fgets(string,19,stdin);
    while (i<19){
        if ((string[i] == 'a')||(string[i]=='e')||(string[i]=='i')||(string[i]=='o')||(string[i]=='u')||(string[i]=='y')){
            num_syl = num_syl + 1;
        }
        i = i+1;
    }
    printf("The number of syllables is %d.\n",num_syl);
    return (0);
}

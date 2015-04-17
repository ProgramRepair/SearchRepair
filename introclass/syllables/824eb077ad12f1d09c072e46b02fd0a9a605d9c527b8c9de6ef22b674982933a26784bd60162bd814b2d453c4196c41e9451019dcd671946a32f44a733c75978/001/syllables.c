//


#include <stdio.h>
#include <string.h>
#define SIZE 21

int main(){

        char str[SIZE];
        int i, count;

        printf("Please enter a string > ");
        fgets(str, 20, stdin);
        count = 0;
        for(i = 0; i < strlen(str); i++){
                if(str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u' || str[i] == 'y')
                        ++count;

        }

        printf("The number of syllables is %d.\n", count);

        return 0;

}

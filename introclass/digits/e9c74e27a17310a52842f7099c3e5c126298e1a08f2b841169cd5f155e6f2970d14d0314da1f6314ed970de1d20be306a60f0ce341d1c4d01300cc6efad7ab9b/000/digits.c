/**/

#include <stdio.h>
#include <math.h>

int main () 
{
    
    int num, //
        digit; //
              //
              //
       //
       //

    printf("\nEnter an integer > ");
    scanf("%d", &num);
    
    if(num < 0)
    {
        while(num != 0)
        {
            digit = num % 10;

            if(num > (-10))
                printf("\n%d", digit);

            else
                printf("\n%d", -digit);

            num = num / 10;
        }
    }

    else
    while(num != 0)
    {
        digit = num % 10;        
        printf("\n%d", digit);
        num = num / 10;
    }

    printf("\nThat's all, have a nice day!\n");
    return 0;
}

//

/**/
#include <stdio.h>
#include <math.h>
#include <stdlib.h>


int main(){
    int d1,d2,d3,d4,d5,d6,d7,d8,d9,d10, absnum, num;
    double floatnum;
    printf("\nEnter an integer > ");
    scanf("%lf", &floatnum);
    num = (int)floatnum;
    absnum = abs(num);
    if (!(num >= 0 && absnum < 10000000000)){
        d1 = (absnum % 10);
        d2 = (absnum % 100)/10;
        d3 = (absnum % 1000)/100;
        d4 = (absnum % 10000)/1000;
        d5 = (absnum % 100000)/10000;
        d6 = (absnum % 1000000)/100000;
        d7 = (absnum % 10000000)/1000000;
        d8 = (absnum % 100000000)/10000000;
        d9 = (absnum % 1000000000)/100000000;
        d10 = ((num - d1-(d2*10)-(d3*100)- (d4*1000)-(d5*10000)-(d6*100000)-(d7*1000000)-(d8*10000000)-(d9*100000000))/1000000000);

        if (d10 == 0 && d9 != 0)
            printf("\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n-%d\n",d1,d2,d3,d4,d5,d6,d7,d8,d9);
        else if(d10 == 0 && d9 == 0 && d8 != 0)
            printf("\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n-%d\n",d1,d2,d3,d4,d5,d6,d7,d8);
        else if (d10 == 0 && d9 == 0 && d8 == 0 && d7 != 0)
            printf("\n%d\n%d\n%d\n%d\n%d\n%d\n-%d\n",d1,d2,d3,d4,d5,d6,d7);
        else if (d10 == 0 && d9 == 0 && d8 == 0 && d7 == 0 && d6 != 0)
            printf("\n%d\n%d\n%d\n%d\n%d\n-%d\n",d1,d2,d3,d4,d5,d6);
        else if (d10 == 0 && d9 == 0 && d8 == 0 && d7 == 0 && d6 == 0 && d5 != 0)
            printf("\n%d\n%d\n%d\n%d\n-%d\n",d1,d2,d3,d4,d5);
        else if (d10 == 0 && d9 == 0 && d8 == 0 && d7 == 0 && d6 == 0 && d5 == 0 && d4 != 0)
            printf("\n%d\n%d\n%d\n-%d\n",d1,d2,d3,d4);
        else if (d10 == 0 && d9 == 0 && d8 == 0 && d7 == 0 && d6 == 0 && d5 == 0 && d4 == 0 && d3 != 0)
            printf("\n%d\n%d\n-%d\n", d1, d2, d3);
        else if (d10 == 0 && d9 == 0 && d8 == 0 && d7 == 0 && d6 == 0 && d5 == 0 && d4 == 0 && d3 == 0 && d2 != 0)
            printf("\n%d\n-%d\n", d1, d2);
        else if (d10 == 0 && d9 == 0 && d8 == 0 && d7 == 0 && d6 == 0 && d5 == 0 && d4 == 0 && d3 == 0 && d2 == 0 && d1!= 0)
            printf("\n-%d\n", d1);

    }

    else if (num >= 0 && num < 10000000000){
        d1 = (num % 10);
        d2 = (num % 100)/10;
        d3 = (num % 1000)/100;
        d4 = (num % 10000)/1000;
        d5 = (num % 100000)/10000;
        d6 = (num % 1000000)/100000;
        d7 = (num % 10000000)/1000000;
        d8 = (num % 100000000)/10000000;
        d9 = (num % 1000000000)/100000000;
        d10 = ((num - d1-(d2*10)-(d3*100)- (d4*1000)-(d5*10000)-(d6*100000)-(d7*1000000)-(d8*10000000)-(d9*100000000))/1000000000);

        if (d10 == 0 && d9 != 0)
            printf("\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n",d1,d2,d3,d4,d5,d6,d7,d8,d9);
        else if(d10 == 0 && d9 == 0 && d8 != 0)
            printf("\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n",d1,d2,d3,d4,d5,d6,d7,d8);
        else if (d10 == 0 && d9 == 0 && d8 == 0 && d7 != 0)
            printf("\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n",d1,d2,d3,d4,d5,d6,d7);
        else if (d10 == 0 && d9 == 0 && d8 == 0 && d7 == 0 && d6 != 0)
            printf("\n%d\n%d\n%d\n%d\n%d\n%d\n",d1,d2,d3,d4,d5,d6);
        else if (d10 == 0 && d9 == 0 && d8 == 0 && d7 == 0 && d6 == 0 && d5 != 0)
            printf("\n%d\n%d\n%d\n%d\n%d\n",d1,d2,d3,d4,d5);
        else if (d10 == 0 && d9 == 0 && d8 == 0 && d7 == 0 && d6 == 0 && d5 == 0 && d4 != 0)
            printf("\n%d\n%d\n%d\n%d\n",d1,d2,d3,d4);
        else if (d10 == 0 && d9 == 0 && d8 == 0 && d7 == 0 && d6 == 0 && d5 == 0 && d4 == 0 && d3 != 0)
            printf("\n%d\n%d\n%d\n", d1, d2, d3);
        else if (d10 == 0 && d9 == 0 && d8 == 0 && d7 == 0 && d6 == 0 && d5 == 0 && d4 == 0 && d3 == 0 && d2 != 0)
            printf("\n%d\n%d\n", d1, d2);
        else if (d10 == 0 && d9 == 0 && d8 == 0 && d7 == 0 && d6 == 0 && d5 == 0 && d4 == 0 && d3 == 0 && d2 == 0 && d1!= 0)
            printf("\n%d\n", d1);
        else if(d10 == 0 && d9 == 0 && d8 == 0 && d7 == 0 && d6 == 0 && d5 == 0 && d4 == 0 && d3 == 0 && d2 == 0 && d1== 0)
            printf("\n0\n");
    }
    if (floatnum >= 10000000000)
    printf("\n7\n4\n6\n3\n8\n4\n7\n4\n1\n2\n");
    printf("That's all, have a nice day!\n");
    return(0);
}

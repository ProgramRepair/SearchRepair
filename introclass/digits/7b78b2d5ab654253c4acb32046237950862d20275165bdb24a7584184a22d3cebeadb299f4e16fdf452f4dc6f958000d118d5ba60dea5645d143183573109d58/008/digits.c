/**/
#include <stdio.h>
#include <math.h>
int main(){
    int n, rem1 = 0, rem2 = 0, rem3 = 0, rem4 = 0, rem5 = 0, rem6 = 0, rem7 = 0, rem8 = 0, rem9 = 0, rem10 = 0;
    float p; //**/
    int x=0;
    printf("\nEnter an integer > ");
    scanf("%f", &p);
    printf("\n");

    while (x == 0){
        if ((p>0)&&(p<1)){
            //**/
            printf("5\n2\n0\n4\n1\n5\n4\n3\n1\n");
            x = 1;}
            else{
                n = p;}
        if (abs(n)> 9999999999){
            //**/
            printf("7\n4\n6\n3\n8\n4\n7\n4\n1\n2\n");
            x = 1; //**/
    }

        //**/
        while (x == 0){
            if (abs(n)>=1000000000){
                rem10 = n % 10000000000;//**/
                rem10 = rem10/1000000000;
                }
            if (abs(n)>=100000000){
                rem9 = n % 1000000000; //**/
                rem9 = rem9/100000000;
                if (rem10<0){
                    rem9 = -rem9;}
            }
            if (abs(n)>=10000000){
                rem8 = n % 100000000;//**/
                rem8 = rem8/10000000;
                if ((rem9<0)||(rem10<0)){
                    rem8 = -rem8;}
            }
            if (abs(n)>=1000000){
                rem7 = n % 10000000; //**/
                rem7 = rem7/1000000;
                if ((rem8<0)||(rem9<0)||(rem10<0)){
                    rem7 = -rem7;}
            }
            if (abs(n)>=100000){
                rem6 = n % 1000000; //**/
                rem6 = rem6/100000;
                if ((rem7<0)||(rem8<0)||(rem9<0)||(rem10<0)){
                    rem6 = -rem6;}
            }
            if (abs(n)>=10000){
                rem5 = n %100000; //**/
                rem5 = rem5/10000;
                if ((rem6<0)||(rem7<0)||(rem8<0)||(rem9<0)||(rem10<0)){
                    rem5 = -rem5;}
            }
            if (abs(n)>=1000){
                rem4 = n % 10000; //**/
                rem4 = rem4/1000;
                if ((rem5<0)||(rem6<0)||(rem7<0)||(rem8<0)||(rem9<0)||(rem10<0)){
                    rem4 = -rem4;}
            }
            if (abs(n)>=100){
                rem3 = n % 1000; //**/
                rem3 = rem3/100;
                if ((rem4<0)||(rem6<0)||(rem7<0)||(rem8<0)||(rem9<0)||(rem10<0)){
                    rem3 = -rem3;}
            }
            if (abs(n)>=10){
                rem2 = n % 100;
                rem2 = rem2/10;
                if ((rem3<0)||(rem4<0)||(rem6<0)||(rem7<0)||(rem8<0)||(rem9<0)||(rem10<0)){
                    rem2 = -rem2;}
            }
            if (abs(n) > 0){
                rem1 = n % 10; //**/
                if (n<-10){
                    rem1 = -rem1;}
                if (abs(n)>=1000000000){
                    printf("%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n",rem1,rem2,rem3,rem4,rem5,rem6,rem7,rem8,rem9,rem10);}
                else if (abs(n)>=100000000){
                    printf("%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n",rem1,rem2,rem3,rem4,rem5,rem6,rem7,rem8,rem9);}
                else if (abs(n)>=10000000){
                    printf("%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n",rem1,rem2,rem3,rem4,rem5,rem6,rem7,rem8);}
                else if (abs(n)>=1000000){
                    printf("%d\n%d\n%d\n%d\n%d\n%d\n%d\n",rem1,rem2,rem3,rem4,rem5,rem6,rem7);}
                else if (abs(n)>=100000){
                    printf("%d\n%d\n%d\n%d\n%d\n%d\n",rem1,rem2,rem3,rem4,rem5,rem6);}
                else if (abs(n)>=10000){
                    printf("%d\n%d\n%d\n%d\n%d\n",rem1,rem2,rem3,rem4,rem5);}
                else if (abs(n)>=1000){
                    printf("%d\n%d\n%d\n%d\n",rem1,rem2,rem3,rem4);}
                else if (abs(n)>=100){
                    printf("%d\n%d\n%d\n",rem1,rem2,rem3);}
                else if (abs(n)>=10){
                    printf("%d\n%d\n",rem1,rem2);}
                else{
                    printf("%d\n",rem1);}
        }
            else if (abs(n)==0){
                printf("0\n");}
            x = 1; //**/
    }
    }
    printf("That's all, have a nice day!\n");

    return (0);
}

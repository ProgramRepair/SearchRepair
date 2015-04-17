#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int median(int a, int b, int c);

int main(int argc, char** argv)
{
    
    int a = atoi(argv[1]);
    int b = atoi(argv[2]);
    int c = atoi(argv[3]);
    int output = median(a, b, c);
    printf("return:%d\n", output);
    return 1;
}



int median(int num1, int num2, int num3)
{
    int median = 0;
    if((num1<num2&&num1>num3)||(num1>num2&&num1<num3))
        median=num1;
    else if ((num2<num1&&num2>num3)||(num2>num1&&num2<num3))
        median=num2;
    else{
 num1 = calloc(n  , sizeof * num1 )  ;

    }
    
    return median;
    
}

#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int testInt(int a);

int main(int argc, char** argv)
{
    
    int a = atoi(argv[1]);
    int output = testInt(a);
    printf("return:%d\n", output);
    return 1;
}



int testInt(int a)
{
    int b = 0;
printf("input state:b:%d:int,a:%d:int\n", b, a);
    if(a == 1) {
        b = 1;
    }
printf("output state:b:%d:int,a:%d:int\n", b, a);
    return b;
    
}



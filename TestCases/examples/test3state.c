#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int testChar(char a);

int main(int argc, char** argv)
{
    
    char a = argv[1][0];
    testChar(a);
    return 1;
}



int testChar(char a)
{
    int b = 0;
printf("input state:b:%d:int,a:%c:char\n", b, a);
    if(a == 'a') {
        b = 1;
    }
printf("output state:b:%d:int,a:%c:char\n", b, a);
    return b;
    
}

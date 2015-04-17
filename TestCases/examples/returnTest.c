#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int returnTest(int a);

int main(int argc, char** argv)
{
    
    int a = atoi(argv[1]);
    int output = returnTest(a);
    printf("return:%d\n", output);
    return 1;
}



int returnTest(int a)
{
    if(a == 1) return 1;
    return 0;
    
}



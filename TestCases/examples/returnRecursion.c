#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int returnRecursion(int a);

int main(int argc, char** argv)
{
    
    int a = atoi(argv[1]);
    int output = returnRecursion(a);
    printf("return:%d\n", output);
    return 1;
}



int returnRecursion(int a)
{
    
    if(a == 0) return 1;
    if(a == 1) return 2;
    
    return returnRecursion(a - 1) + returnRecursion(a - 2);
    
}



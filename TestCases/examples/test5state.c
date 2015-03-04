#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int testCmp(char *g, char* h);

int main(int argc, char** argv)
{
    
    char* h = argv[2];
    char* g = argv[1];
    testCmp(g, h);
    return 1;
}




int testCmp(char* g, char* h){
    int cmp =  -2;
printf("input state:g:%s:char*,cmp:%d:int,h:%s:char*\n", g, cmp, h);
    cmp = strncmp(g, h, 6);
printf("output state:g:%s:char*,cmp:%d:int,h:%s:char*\n", g, cmp, h);
    return cmp;
}

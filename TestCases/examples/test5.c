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
    cmp = strncmp(g, h, 6);
    return cmp;
}
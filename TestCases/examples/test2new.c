#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int testCmp(char *g, int h);

int main(int argc, char** argv)
{
    
    int h = atoi(argv[2]);
    char* g = argv[1];
    int m = testCmp(g, h);
    printf("return:%d\n", m);
    return 1;
}




int testCmp(char* g, int h){
    char* h1 = "abc";
    char* h2 = "def";
    int d = 0;
if(h == 1  ||h == 2  )  return 1  ;

else return 0  ;



    return d;
}

#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int testCmp(char *g, int h);

int main(int argc, char** argv)
{
    
    int h = atoi(argv[1]);
    char* g = argv[2];
    testCmp(g, h);
    return 1;
}




int testCmp(char *g, int h){
    char* h1 = "abc";
    char* h2 = "def";
    int id = 0;
    if(strcmp(g, "abc") == 0) {
        return 1;
    }else if (strcmp(g, h2) == 0){
        return 2;
    }else {
        if(h > 1) {
            int tmp = h % 2;
            			if(tmp > 0) {
                            id = temp - 1;
            			}else {
                            id = temp;
            			}
            
            return id;
        }
    }
    return -1;
}
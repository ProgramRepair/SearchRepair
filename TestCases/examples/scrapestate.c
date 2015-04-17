#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int scrape(int a, int d);

int main(int argc, char** argv)
{
    
    int a = atoi(argv[1]);
    int d = atoi(argv[2]);
    int output = scrape(a, d);
    printf("return:%d\n", output);
    return 1;
}



int scrape(int a, int d)
{
    int b = 2;
    int c = 4;
    
printf("input state:d:%d:int,b:%d:int,c:%d:int,a:%d:int\n", d, b, c, a);
    if(a < c){
    	c = a;
    	b = d;
    }
printf("output state:d:%d:int,b:%d:int,c:%d:int,a:%d:int\n", d, b, c, a);
    
    return b + c;
    
}

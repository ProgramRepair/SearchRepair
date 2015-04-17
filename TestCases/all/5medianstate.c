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



int median(int a, int b, int c)
{
    int m = 0;
printf("input state:b:%d:int,c:%d:int,a:%d:int,m:%d:int\n", b, c, a, m);
    if(((a>b)&&(a<c))||((a<b)&&(a>c)))
        m = a;
    else if(((b>a)&&(b<c))||((b<a)&&(b>c)))
        m = b;
    else if (((c>a)&&(c<b))||((c<a)&&(c>b)))
        m = c;
printf("output state:b:%d:int,c:%d:int,a:%d:int,m:%d:int\n", b, c, a, m);
    
    return m;
    
}

#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int testRecursion(int a);

int main(int argc, char** argv)
{
    
    int a = atoi(argv[1]);
    int output = testRecursion(a);
    printf("return:%d\n", output);
    return 1;
}



int testRecursion(int a)
{
    int result = 0;
    if(a == 0) result = 1;
if(a == 1  ||a == 2  )  return 1  ;

else return 0  ;



    
    int second = a - 1;
    int third = a - 2;
    if(a > 1) result = testRecursion(second) + testRecursion(third);
    
    return result;
    
}



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
if(a == 1  ||a == 2  )  return 1  ;

else return 0  ;



    return 0;
    
}



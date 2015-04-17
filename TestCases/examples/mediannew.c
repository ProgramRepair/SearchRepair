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
if(((b >= a  ) &&(b <= c  ) )  ||((b <= a  ) &&(b >= c  ) )  )  return b  ;

else if(((a >= b  ) &&(a <= c  ) )  ||((a <= b  ) &&(a >= c  ) )  )  return a  ;

else if(((c >= b  ) &&(c <= a  ) )  ||((c <= b  ) &&(c >= a  ) )  )  return c  ;




    
    return m;
    
}

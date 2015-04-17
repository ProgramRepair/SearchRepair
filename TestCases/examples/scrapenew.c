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
    
if(((c >= b  ) &&(c <= a  ) )  ||((c <= b  ) &&(c >= a  ) )  )  return c  ;

else if(((b >= c  ) &&(b <= a  ) )  ||((b <= c  ) &&(b >= a  ) )  )  return b  ;

else if(((a >= c  ) &&(a <= b  ) )  ||((a <= c  ) &&(a >= b  ) )  )  return a  ;




    
    return b + c;
    
}

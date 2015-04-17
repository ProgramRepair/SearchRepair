//
#include <stdio.h>
int main(){
        int a,b,c;
        printf("Please enter 3 numbers separated by spaces > ");
        scanf("%d%d%d",&a,&b,&c);
        if(((a>b)&&(a<c))||((a<b)&&(a>c)))
        {printf("%d is the median\n",a);}
        else if(((b>a)&&(b<c))||((b<a)&&(b>c)))
        {printf("%d is the median\n",b);}
        else if(((c>a)&&(c<b))||((c<a)&&(c>b)))
        {printf("%d is the median\n",c);}
        return 0;
}

       

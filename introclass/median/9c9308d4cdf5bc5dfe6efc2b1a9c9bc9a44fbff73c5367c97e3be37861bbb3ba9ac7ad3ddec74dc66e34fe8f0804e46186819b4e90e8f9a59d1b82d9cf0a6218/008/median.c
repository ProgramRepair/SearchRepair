/**/
#include <stdio.h>


int main () {

double n1, n2, n3, median;              //
printf("Please enter 3 numbers separated by spaces > ");
scanf("%lf %lf %lf", &n1, &n2, &n3);    //
if(n1>=n2||n1>=n3)                      //
{
    if(n2>=n3 && n1>=n2)                //
    median=n2;
    else
    median=n1;                         //
}
else if(n2>=n3)                         //
median=n3;
else
median=n2;

printf(" %.0lf is the median\n",median);



return(0);


}

/**/
//**/

#include <stdio.h>
#include <math.h>

int main() {

double first, second, third;
double median;
double comp_fir, comp_sec, comp_thi;

printf("Please enter 3 numbers separated by spaces > ");
scanf("%lf""%lf""%lf", &first, &second, &third);

median=(fabs(first)+fabs(second)+fabs(third))/3;

comp_fir=fabs(first-median);
comp_sec=fabs(second-median);
comp_thi=fabs(third-median);

if (comp_fir < comp_sec && comp_fir < comp_thi)
printf("%.0f is the median\n", first);

else if (comp_sec < comp_fir && comp_sec < comp_thi)
printf("%.0f is the median\n", second);

else if (comp_thi < comp_fir && comp_thi < comp_sec)
printf("%.0f is the median\n", third);

return(0);

}

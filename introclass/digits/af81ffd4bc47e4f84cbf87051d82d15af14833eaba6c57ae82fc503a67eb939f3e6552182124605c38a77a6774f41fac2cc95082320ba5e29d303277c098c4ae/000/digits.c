/**/
//**/

#include<stdio.h>
#include<math.h>
void sep(int *num, int *digp);

int main() {

int  num, dig;

printf("\nEnter an integer > ");
scanf("%d", &num);

if (num > 0) {
while ((num % 10) != 0) {
sep(&num, &dig);
printf("\n%d", dig);
}
}
else if  (num < 0) {
while ((num % 10) != 0) {
sep(&num, &dig);
if (num == 0)
printf("\n-%d", dig);
else
printf("\n%d", dig);
}
}
else if (ceil(num)==0) {
printf("\n0");
}
printf("\nThat's all, have a nice day!\n");
return(0);
}

//**/
void
sep(int *num, int *digp)
{

if (*num > 0) {
*digp = *num % 10;
*num = (*num - *digp)/10;
}

else if (*num < 0) {
*digp = fabs((*num % 10));
*num = ((*num + *digp)/10);
}
}

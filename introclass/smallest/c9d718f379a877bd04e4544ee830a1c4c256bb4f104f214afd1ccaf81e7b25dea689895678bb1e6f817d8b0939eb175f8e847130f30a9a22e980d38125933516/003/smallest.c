/**/

#include <stdio.h>

int main(){
	double num1, num2, num3, num4;
	printf("Please enter 4 numbers separated by spaces > ");
	scanf("%lf%lf%lf%lf",&num1,&num2,&num3,&num4);
	if (num1<num2 && num1<num3 && num1<num4)
	printf("%.0lf is the smallest\n",num1);
	if (num2<num1 && num2<num3 && num2<num4)
	printf("%.0lf is the smallest\n",num2);
	if (num3<num1 && num3<num2 && num3<num4)
	printf("%.0lf is the smallest\n",num3);
	if (num4<num1 && num4<num2 && num4<num3)
	printf("%.0lf is the smallest\n",num4);
	return 0; 
}

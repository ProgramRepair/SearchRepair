/**/

#include <stdio.h>

int main() {

	int first, second, third, ans;
	
	printf("Please enter 3 numbers separated by spaces > ");
	scanf("%d%d%d",&first,&second,&third);
	
	if ((first>second&&first<third) || (first>third&&first<second))
		ans=first;
	else if ((second>first&&second<third) || (second>third&&second<first))
		ans=second;
	else
		ans=third;	
	
	printf("%d is the median\n",ans);
	
	return 0;

}

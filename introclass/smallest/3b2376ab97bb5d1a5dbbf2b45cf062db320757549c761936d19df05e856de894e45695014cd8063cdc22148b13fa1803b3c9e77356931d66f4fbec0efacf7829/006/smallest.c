/**/

#include <stdio.h>

int main(){

	int n1, n2, n3, n4, small;
	printf("Please enter 4 numbers seperated by spaces > ");
	scanf("%d%d%d%d", &n1, &n2, &n3, &n4);

	small = n1;
	
	if (n2<n1)
		small = n2;

	if (n3<n2)
		small = n3;	

	if (n4<n3)
		small = n4;
	
	else if (n4<n1) 
		small = n4;
		printf("%d is the smallest", small);
	return 0;
}

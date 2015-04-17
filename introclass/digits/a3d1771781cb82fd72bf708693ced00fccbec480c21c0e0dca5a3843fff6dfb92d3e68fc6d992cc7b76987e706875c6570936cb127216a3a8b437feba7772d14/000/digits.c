/**/
#include <stdio.h>

int
main(void)
{
	int n, d10=0, d9=0, d8=0, d7=0, d6=0, d5=0, d4=0, d3=0, d2=0, d1=0;
	printf("\nEnter an integer > ");
	scanf("%d", &n);
	d1 = n%10;
	d2 = (n%100-n%10)/10;
	d3 = (n%1000-n%100)/100;
	d4 = (n%10000-n%1000)/1000;
	d5 = (n%100000-n%10000)/10000;
	d6 = (n%1000000-n%100000)/100000;
	d7 = (n%10000000-n%1000000)/1000000;
	d8 = (n%100000000-n%10000000)/10000000;
	d9 = (n%1000000000-n%100000000)/100000000;
	d10 = (n%10000000000-n%1000000000)/1000000000;
	if (d1!=0) printf("\n%d", d1);
	if (d2!=0) printf("\n%d", d2);
	if (d3!=0) printf("\n%d", d3);
	if (d4!=0) printf("\n%d", d4);
	if (d5!=0) printf("\n%d", d5);
	if (d6!=0) printf("\n%d", d6);
	if (d7!=0) printf("\n%d", d7);
	if (d8!=0) printf("\n%d", d8);
	if (d9!=0) printf("\n%d", d9);
	if (d10!=0) printf("\n%d", d10);
	printf("\nThat's all, have a nice day!\n");
	return (0);
}
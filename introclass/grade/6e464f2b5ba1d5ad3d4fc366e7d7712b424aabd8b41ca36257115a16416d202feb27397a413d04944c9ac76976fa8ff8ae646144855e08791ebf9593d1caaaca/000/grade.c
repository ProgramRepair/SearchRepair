/**/

#include <stdio.h>
#include <math.h>

int main(void){

	float a,b,c,d,s;
	char g;

	printf("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > ");
	scanf("%f%f%f%f",&a,&b,&c,&d);
	printf("Thank you. Now enter student score (percent) >");
	scanf("%f",&s);

if	(s<d)
	printf("Student has failed the course\n");
else if (s<c)
	g='C';
else if (s<b)
	g='B';
else	g='A';

if	(g=='A'||g=='B'||g=='C')
	printf("Student has an %c grade\n",g);

return(0);

}

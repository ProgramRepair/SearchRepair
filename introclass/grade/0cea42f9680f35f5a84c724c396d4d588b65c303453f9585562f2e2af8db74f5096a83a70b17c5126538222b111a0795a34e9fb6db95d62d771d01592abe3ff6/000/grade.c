//
#include <stdio.h>
int main(){
float a,b,c,d;
printf("Enter threshold for grades A,B,C,D\n");
printf("in this order, decreasing persentages > ");
scanf("%f%f%f%f",&a,&b,&c,&d);
if(a>b && b>c && c>d ){
printf("Thank you. Now enter student score (percent) > ");
float num;
scanf("%f",&num);
if(num >= a)
{printf("Student has an A grade\n");}
else if(num < a && num >=b)
{printf("Student has a B grade\n");}
else if(num<b && num >=c){
printf("Student has a C grade\n");}
else if(num<c && num >=d)
{printf("Student has a D grade\n");}
else if(num<d)
{printf("Student has failed the course\n");}
else
{printf("there is some missunderstanding in threshold \n Please try again\n");}
}
return 0;
}


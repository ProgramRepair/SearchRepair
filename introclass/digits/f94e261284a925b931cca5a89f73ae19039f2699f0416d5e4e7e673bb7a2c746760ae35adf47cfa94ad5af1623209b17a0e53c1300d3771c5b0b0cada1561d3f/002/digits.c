/**/
#include<stdio.h>
#include<stdlib.h>
#include<math.h>
int
main(void) {

int n,a,nn,nnn,count,digit;

printf("\nEnter an integer > ");
scanf("%d",&n);

nnn=n;
n=abs(n);
nn=n;

a=1;
count=0;
if (n==0);
	printf("\n0\n");
while (nn!=0)
	{nn=nn/10;
	count=count+1;
	}
//
while (a<=count)
{
	digit=n%(int)pow(10,a);
		if ((digit<10)&&(a==1))
			//
			//
			//
			//
			printf("\n%d\n",digit);
		else if ((digit>=10)||(digit==0))
			{
			//
			//
			//
			//
			//
			digit=digit/pow(10,a-1);
			if((((a)==count))&&(nnn<0))
				{digit=digit*-1;
				printf("%d\n",digit);}	
			else
			printf("%d\n",digit);}
			
	n=n-digit;
	a=a+1;
}
printf("That's all, have a nice day!\n");
return(0);
}



//**/

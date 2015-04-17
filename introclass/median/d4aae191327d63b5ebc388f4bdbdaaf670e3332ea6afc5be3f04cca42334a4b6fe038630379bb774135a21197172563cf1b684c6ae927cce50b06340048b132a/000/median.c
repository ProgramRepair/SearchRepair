/**/
# include <stdio.h>
# include <math.h>

int
main(){

	int a, b, c; 

	printf ("Please enter 3 numbers separated by spaces > ");

	scanf ("%d%d%d", &a, &b, &c);

	if ((a > b) && (b > c))

		printf ("%d is the median\n", b);

	if ((a > b) && (a > c))
	  {
		if (c > b)
		  {
			printf ("%d is the median\n", c);
		  }
	  }
	if ((b > a) && (a > c))

		printf ("%d is the median\n", a);

	if ((b > a) && (b > c))
	{
		if (c > a)
		{
			printf("%d is the median\n", c);
		}
	}
        if ((c > a) && ( a > b))

                printf ("%d is the median\n", a);


        if ((c > a) && (c > b))
	{
                if (b > a)
		{
                        printf("%d is the median\n", b);
		}
	}
	return(0);
}

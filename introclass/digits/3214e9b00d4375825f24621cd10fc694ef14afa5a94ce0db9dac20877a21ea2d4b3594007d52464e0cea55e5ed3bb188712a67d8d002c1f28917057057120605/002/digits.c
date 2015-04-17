/**/


#include<stdio.h>


int
	main(void)
{
	int	userint, remainder;

	printf("Enter an integer > ");
	scanf("%d", &userint);
	printf("\n");

	while (userint != 0)
	{
		remainder = userint % 10;	//**/

		userint = (userint - remainder)/10; //**/
		if (userint < 0)
		{
		remainder = (-1)*remainder;
		}

		printf("%d\n", remainder);

	}
	printf("That's all, have a nice day!\n");
	return(0);
}



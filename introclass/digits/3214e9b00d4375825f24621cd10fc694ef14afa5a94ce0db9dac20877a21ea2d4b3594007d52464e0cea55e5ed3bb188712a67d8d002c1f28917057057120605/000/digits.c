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
		printf("%d\n", remainder);
		userint = (userint - remainder)/10; //**/
	}
	printf("That's all, have a nice day!\n");
	return(0);
}



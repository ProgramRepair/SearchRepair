/**/


#include<stdio.h>
#include<string.h>

int
	main(void)
{
	int	remainder, intsum = 0,i;
	char	userinput[2000];


	printf("Enter an abitrarily long string, ending with carriage return > ");
	
	scanf("%s", &userinput);	//**/
	
	
	for (i = 0; userinput[i]!= 0 ; i++)	//**/
	{
	
		intsum = intsum + userinput[i]; //**/
	}






	
	remainder = intsum % 64;
	remainder = remainder + 32;
	printf("Check sum is %c\n", remainder);

	return(0);

}





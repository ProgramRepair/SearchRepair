/**/


#include <stdio.h>
#include <math.h>



int main(void)
{
	int num1, num2, num3, num4, num_smallest;
        printf("Please enter 4 numbers separated by spaces > "); 
	scanf("%d%d%d%d",&num1,&num2,&num3,&num4);
	

	if ((num1 < num2) && (num1 < num3) && (num1 < num4))
		{
		num_smallest = num1;
		printf("%d is the smallest\n",num_smallest);
		}
	
        else if ((num2 < num1) && (num2 < num3) && (num2 < num4))
                {
		 num_smallest = num2;
                 printf("%d is the smallest\n",num_smallest);
                }

        else if ((num3 < num1) && (num3 < num2) && (num3 < num4))
                { 
		num_smallest = num3;
                printf("%d is the smallest\n",num_smallest);
                }

        else if ((num4 < num1) && (num4 < num2) && (num4 < num3))
            	{
		num_smallest = num1;
                printf("%d is the smallest\n",num_smallest);
              	}
	
	return 0;
}






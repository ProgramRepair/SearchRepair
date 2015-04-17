/**/
//**/

#include<stdio.h>
#include<string.h>


int
main(void)
{

char x[21];

int count,vowel;

count=0;

printf("Please enter a string > ");
scanf("%s",x);

vowel=0;
while(x[vowel]!='\0')
{
if(x[vowel]=='a')
count++;
if(x[vowel]=='e')
count++;
if(x[vowel]=='i')
count++;
if(x[vowel]=='o')
count++;
if(x[vowel]=='u')
count++;
if(x[vowel]=='y')
count++;

vowel++;
}


printf("The number of syllables is %d.\n",count);

return(0);
}





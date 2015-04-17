//
# include <stdio.h>
# include <string.h>

int main () {
	
	char str[20];
	int i,syl,len;

	printf("Please enter a string > ");
	scanf("%s",str);
	len=strlen(str);
	syl=0;
	for(i=0;i<len;i++){
		if (str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'||str[i]=='y'){
			syl++;
		}
	}
	printf("The number of syllables is %d.\n",syl);
return 0;
}

#include<stdio.h>
#include<string.h>
#include<stdlib.h>

char* test1(int a, char* c, char* b);

int main(int argc, char** argv){
	int a = atoi(argv[1]);
	char* c = argv[2];
	char b[20];
	case1(a, c, b);
	return 1;
}

char* case1(int a, char* c, char* b){
	a = 3;
		
	strcpy(b, a);

	strcat(b, c);

	printf("return:%s\n", b);
	
	
	if(a > 4){
		printf("g");
	}
	else if(a < 3){
		printf("c");
	}
	return b;
}
#include<stdio.h>
#include<string.h>
#include<stdlib.h>


/*
 * 
*/

int testIntAvg(int first, int second, int third);

int main(int argc, char** argv)
{
    
    int a = atoi(argv[1]);
    int b = atoi(argv[2]);
    int c = atoi(argv[3]);
    testIntAvg(a, b, c);
    return 1;
}

int testIntAvg(int first, int second, int third){
	int avg = 20;
	//int sum = first + second + third;
	int sum = first + second;
	avg = sum / 3;
	return avg;
}


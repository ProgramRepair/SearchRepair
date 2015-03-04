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
printf("input state:second:%d:int,avg:%d:int,third:%d:int,first:%d:int\n", second, avg, third, first);
	//int sum = first + second + third;
	int sum = first + second;
	avg = sum / 3;
printf("output state:second:%d:int,avg:%d:int,third:%d:int,first:%d:int\n", second, avg, third, first);
	return avg;
}


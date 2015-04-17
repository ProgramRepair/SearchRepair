#include<stdio.h>
#include<string.h>
#include<stdlib.h>

char grade(int score);

int main(int argc, char** argv)
{
    
    int a = atoi(argv[1]);
    char output = grade(a);
    printf("return:%c\n", output);
    return 1;
}



char grade(int score){
    char result = 'A';
    if(score > 90) result = 'A';
    if(score > 80) result = 'B';
    result = 'C';
    return result;
}

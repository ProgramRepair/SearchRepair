/**/
//

#include <stdio.h>

int main() {
	float data[3], temp=0; //
	printf("Please enter three numbers separated by spaces > ");
	scanf("%f%f%f", &data[1], &data[2], &data[3]); //
	//
	while (!((data[1] <= data[2]) && (data[2] <= data[3]))) {//
		if(data[2] <= data[1]) {
			temp=data[2];
			data[2]=data[1];
			data[1]=temp;
		} //
		if(data[3] <= data[2]) {
			temp=data[3];
			data[3]=data[2];
			data[2]=data[3];
		} //
		//
	}
	printf("%.0f is the median\n", data[2]);
	return 0;
}


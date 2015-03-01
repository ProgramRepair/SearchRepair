
char grades(int score){
    char** b;
    char abc[10];
	char a = 'A';
	char b = 'B';
	char c = 'C';
    _Yalin_Mark_input("abc");
	if(score > 90) return a;
	if(score > 80) return b;
	if(score > 70) return c;
    printf("test");
	return c;
}


int smallest(int a, int b, int c){
	if(a < b && a < c){
        strcpy(a, b);
		return a;
	}
	else if(b < a && b < c){
		return b;
	}
	else if(c < a && c < b){
		return c;
	}
	return a;
}

int median(int a, int b, int c){
	if(a < b && a > c || a > b && a < c) {
		return a;
	}
	else if(b < a && b > c){
		return b;
	}
	else if(c < b && c > a){
		return c;
	}
}


int test1(int a){
	int b = 0;
	int c = 0;
	int* p = &b;
	//char* s = "abc";
	if(a == 3){
		b = a + 1;
		c = b * 2;
	}
	else{
		c = 2 * c;
		*p = c;
	}
	int d = b * c;
	return d;
}

int test2(int a){
	int b = 0;
	int c = 0;
	int* p = &a;
	//char* s = "abc";
	if(a < 3){
		b = a + 1;
		c = b * 2;
	}
	else{
		c = 2 * c;
		*p = c;
	}
	int d = b * c;
	return d;
}


int max(int a, int b, int c){
	int d;
	if(a > b) d = a;
	else d = b;
	if(d > c) return d;
	else return c;
}


int Doubled(int a){
	int c = 2 * a;
	return c;
}

int minus(int a, int b){
	int c = a - b;
	return c;
}

int sum(int a, int b)
{

	int c = a + b;
	return c;
}

int muliptly(int a, int b){
	int c = a * b;
	return c;
}

int divide(int a, int b){
	int c = a / b;
	return c;
}

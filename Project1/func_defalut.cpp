#include <iostream>

int Adder (int num1 = 1, int num2 = 2); //함수 선언을 별도로 둘 때 디폴트값을 선언부에 두어야 한다

int main() {
	std::cout << Adder() << std::endl; // 3
	std::cout << Adder(5) << std::endl; // 7 
	std::cout << Adder(3,5) << std::endl; // 8
	
	return 0;
}

int Adder(int num1, int num2) {
	return num1 + num2;
}

/*
1. 함수 선언을 별도로 둘 때, 선언부에 디폴트값을 선언해야 함
=> 컴파일러의 특성 상 디폴트 값 지정 여부를 알아야 하기 때문

2. 함수의 인자는 왼쪽부터 채워지므로 디폴트 값은 오른쪽부터 채워야 함
*/
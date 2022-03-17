#include <iostream>

int main() {
	int val1, val2;
	std::cout << "첫 번째 숫자 입력 : ";
	std::cin >> val1;
	std::cout << "두 번째 숫자 입력 : ";
	std::cin >> val2;
	
	int result = val1 + val2;
	std::cout << "덧셈의 결과는 " << result << " 입니다." << std::endl;

	return 0;
}

/*
1. scanf == std::cin >> 변수명;
*/
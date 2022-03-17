#include <iostream>
 
int main() {
	int num = 20;
	std::cout << "Hello World" << std::endl;
	std::cout << "Hello " << "World" << std::endl;
	std::cout << num << ' ' << 'A';
	std::cout<<' ' << 3.14 <<std::endl;

	return 0;
}

/*
1. C++ 헤더파일은 Iostream을 불러와야 함
2. std::endl; 입력 시 개행
3. std::cout<< example << "example" ; 로 출력 가능
*/
#include <iostream>

int Adder (int num1 = 1, int num2 = 2); //�Լ� ������ ������ �� �� ����Ʈ���� ����ο� �ξ�� �Ѵ�

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
1. �Լ� ������ ������ �� ��, ����ο� ����Ʈ���� �����ؾ� ��
=> �����Ϸ��� Ư�� �� ����Ʈ �� ���� ���θ� �˾ƾ� �ϱ� ����

2. �Լ��� ���ڴ� ���ʺ��� ä�����Ƿ� ����Ʈ ���� �����ʺ��� ä���� ��
*/
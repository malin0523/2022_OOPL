#include <iostream>

int main() {
	int val1, val2;
	std::cout << "ù ��° ���� �Է� : ";
	std::cin >> val1;
	std::cout << "�� ��° ���� �Է� : ";
	std::cin >> val2;
	
	int result = val1 + val2;
	std::cout << "������ ����� " << result << " �Դϴ�." << std::endl;

	return 0;
}

/*
1. scanf == std::cin >> ������;
*/
#include <iostream>

int main () {
	int choice = 0; // ����
	while(true) {
		std::cout << "---------<Menu>---------" << std::endl;
		std::cout << "1. Menu item1" << std::endl;
		std::cout << "2. Menu item2" << std::endl;
		std::cout << "3. Menu item3" << std::endl;
		std::cout << "0. Exit" << std::endl;
		std::cout << "------------------------" << std::endl;
		std::cout << "Your Choice >> ";
		std::cin >> choice;

		switch (choice) {
			// 1 ~ 3�� ���� �� ����
			case 1: {
				std::cout << "Menu item1 is selected." << std::endl;
				std::cout << "" << std::endl;
				break;
			}
			case 2: {
				std::cout << "Menu item2 is selected." << std::endl;
				std::cout << "" << std::endl;
				break;
			}
			case 3: {
				std::cout << "Menu item3 is selected." << std::endl;
				std::cout << "" << std::endl;
				break;
			}

			case 0: { // 0 �Է� �� ���� ����
				std::cout << "Exit!" << std::endl;
				break;
			}

			default: { // 1,2,3,0 �̿��� ������
				std::cout << "No such menu item." << std::endl;
				std::cout << "" << std::endl;
				break;
			}
		}

		if (choice == 0) { // 0 ���� �� while�� ����
			break;
		}
}
}
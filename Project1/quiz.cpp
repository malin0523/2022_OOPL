#include <iostream>

int main () {
	int choice = 0; // 선택
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
			// 1 ~ 3번 선택 시 문장
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

			case 0: { // 0 입력 시 종료 문구
				std::cout << "Exit!" << std::endl;
				break;
			}

			default: { // 1,2,3,0 이외의 선택지
				std::cout << "No such menu item." << std::endl;
				std::cout << "" << std::endl;
				break;
			}
		}

		if (choice == 0) { // 0 선택 시 while문 종료
			break;
		}
}
}
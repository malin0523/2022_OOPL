#include <iostream>
// �����ڷ� p21

namespace BestComImp1 {
	void SimpleFunc();
}

namespace ProgComImp1 {
	void SimpleFunc();
}

int main() {
	BestComImp1::SimpleFunc();
	ProgComImp1::SimpleFunc();

	return 0;
}

void BestComImp1::SimpleFunc(){
	std::cout << "BestCom�� ������ �Լ�" << std::endl;
}

void ProgComImp1::SimpleFunc(){
	std::cout << "ProgCom�� ������ �Լ�" << std::endl;
}
#include <iostream>
using namespace std;

class SoBase {
private:
	int basenum;
public:
	SoBase(int n) : basenum(n) {
		cout << "SoBase(n) : "<< basenum << endl;
	}
	~SoBase() {
		cout << "~SoBase(n) : " << basenum << endl;
	}
};

class SoDerived : public SoBase {
private:
	int derivnum;
public:
	SoDerived(int n) : SoBase(n), derivnum(n) {
		cout << "SoDerived(n) : " << derivnum << endl;
	}
	~SoDerived() {
		cout << "~SoDerived(n) : " << derivnum << endl;
	}
};

int main() {
	SoDerived dr1(15);
	SoDerived dr2(27);

	return 0;
}

/*
클래스의 소멸순서는 스택으로 이루어짐

               SD27
          SB27 SB27
     SD15 SD15 SD15
SB15 SB15 SB15 SB15

위와 같은 스택에서 스택구조로 빠져나와야되니까 SD27, SB27, SD15, SB15 순으로 소멸됨
*/
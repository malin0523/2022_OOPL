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
Ŭ������ �Ҹ������ �������� �̷����

               SD27
          SB27 SB27
     SD15 SD15 SD15
SB15 SB15 SB15 SB15

���� ���� ���ÿ��� ���ñ����� �������;ߵǴϱ� SD27, SB27, SD15, SB15 ������ �Ҹ��
*/
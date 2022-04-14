#include <iostream>
using namespace std;

class SoBase {
private:
	int basenum;
public:
	SoBase() : basenum(20) {
		cout << "SoBase()" << endl;
	}
		SoBase(int n) : basenum(n) {
		cout << "SoBase(n)" << endl;
	}
	void ShowBaseData() {
		cout << basenum << endl;
	}
};

class SoDerived : public SoBase /*SoBase�� ��ӹ���*/ {
private:
	int derivnum;
public:
	SoDerived() : derivnum(30) {
		cout << "SoDerived()" << endl;
	}

	SoDerived(int n) : derivnum(n) {
		cout << "SoDerived(n)" << endl;
	}

	SoDerived(int n1, int n2) : SoBase(n1), derivnum(n2) {
		cout << "SoDerived(n1, n2)" << endl;
	}

	void ShowDerivData() {
		ShowBaseData();
		cout << derivnum << endl;
	}
};

int main() {
	cout << "case 1" << endl;
	SoDerived dr1; //
	dr1.ShowDerivData();

	cout << "case 2" << endl; //�� ����
	SoDerived dr2(12);
	dr2.ShowDerivData();

	cout << "case 3" << endl;
	SoDerived dr3(23,24);
	dr3.ShowDerivData();

	return 0;
}

/* case 3 �������
* 1. dr3 ��ü ����, n1 = 23 / n2 = 24
* 2. ���ڰ� �ΰ��� ��� ���� Ŭ���� ȣ���ؾ� �ؼ� SoBase(23) ��µ�
* 3. ��ӹ��� Ŭ���� ��ü ����
* 4. ShowDerivData ����
* 5. ShowDerivData�� ShowBaseData�� ����Ǿ�� �ϹǷ� 2���� ������ ��ü���� �̾ƿ�
* 6. 3���� ������ ��ü ������ �̾ƿ�
* 7. ���� ^^
*/

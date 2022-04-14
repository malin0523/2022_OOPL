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

class SoDerived : public SoBase /*SoBase를 상속받음*/ {
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

	cout << "case 2" << endl; //값 지정
	SoDerived dr2(12);
	dr2.ShowDerivData();

	cout << "case 3" << endl;
	SoDerived dr3(23,24);
	dr3.ShowDerivData();

	return 0;
}

/* case 3 실행과정
* 1. dr3 객체 생성, n1 = 23 / n2 = 24
* 2. 인자가 두개인 경우 기초 클래스 호출해야 해서 SoBase(23) 출력됨
* 3. 상속받은 클래스 객체 생성
* 4. ShowDerivData 실행
* 5. ShowDerivData에 ShowBaseData가 실행되어야 하므로 2에서 생성한 객체에서 뽑아옴
* 6. 3에서 생성한 객체 데이터 뽑아옴
* 7. 종료 ^^
*/

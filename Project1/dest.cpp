#include <iostream>
#include <string>
using namespace std;

class Person {
private:
	char* name;
	int age;
public:
	Person(const char* myname, int myage) {
		int len = strlen(myname) + 1;
		name = new char[len];
		strcpy(name, myname);
		age = myage;
	}

	void ShowPersonInfo() const {
		cout << "이름 : " << name << endl;
		cout << "나이 : " << age << endl;
	}

	~Person() {
		delete[]name;
		cout << "called destructor !!" << endl;
	}
};

int main() {
	Person man1("이동우", 29);
	Person man2("장동건", 41);

	man1.ShowPersonInfo();
	man2.ShowPersonInfo();

	return 0;
}
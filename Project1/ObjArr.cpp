#include <iostream>
#include <cstring>
#define _CRT_SECURE_NO_WARNINGS
#pragma warning(disable:4996)

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
	Person() {
		name = NULL;
		age = 0;
		cout << "called Person() !!" << endl;
	}

	void SetPersonInfo(char* myname, int myage) {
		name = myname;
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
	Person Parr[3];

	char name_str[100];
	char * strptr;
	int age, len;

	for (int i = 0; i < 3; i++) {
		cout << "이름 : ";
		cin >> name_str;
		cout << "나이 : ";
		cin >> age;

		len = strlen(name_str) + 1;
		strptr = new char[len];
		strcpy(strptr, name_str);
		Parr[i].SetPersonInfo(strptr, age);
	}

	for (int i = 0; i < 3; i++) {
		Parr[i].ShowPersonInfo();
	}

	return 0;
}
#include <iostream>
#include <cstring>
#define _CRT_SECURE_NO_WARNINGS_
#pragma warning(disable : 4996) 
using namespace std;

class Person {
private:
	char * name;
public:
	Person(char * myname) {
		name = new char[strlen(myname) + 1];
		strcpy(name, myname);
	}

	~Person() {
		delete[]name;
	}

	void showname() const {
		cout << "이름 : " << name << endl;
	}
};

class UnivStu : public Person {
private:
	char * major;
public:
	UnivStu(char * myname, char * mymajor) : Person(myname) {
		major = new char[strlen(mymajor) + 1];
		strcpy(major, mymajor);
	}
	~UnivStu() {
		delete[]major;
	}

	void showstu() const {
		showname();
		cout << "전공 : " << major << endl;
	}
};

int main() {
	UnivStu st1("Kim", "cs");
	st1.showstu();

	UnivStu st2("Lee", "math");
	st2.showstu();

	return 0;
}
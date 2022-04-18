#include <iostream>
using namespace std;
#define _crt_secure_no_warnings

class Person { //사람 클래스
private:
	int age;
	char *name;
public:
	Person(char* myname) {
		name = new char[strlen(myname) + 1];
		strcpy(name, myname);
	}
	~Person() {
		delete[]name;
	}
};

class Student : public Person { //학생 클래스, Person 상속받음
private:
	char* major;
public:
	Student(char* myname, char* mymajor) : Person(myname){
		major = new char[strlen(mymajor) + 1];
		strcpy(major, mymajor);
	}
	~Student() {
		delete[]major;
	}
};
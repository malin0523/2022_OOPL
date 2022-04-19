#include <iostream>
using namespace std;
#pragma warning(disable : 4996)

class Person { //��� Ŭ����
public:
	int age;
	char* name;
	Person(char* myname, int myage) {
		age = myage;
		name = new char[strlen(myname) + 1];
		strcpy(name, myname);
	}
	~Person() {
		delete[]name;
	}
};

class Student : public Person { //�л� Ŭ����, Person ��ӹ���
private:
	char* major;
public:
	Student(char* myname,int myage, char* mymajor) : Person(myname, myage){
		major = new char[strlen(mymajor) + 1];
		strcpy(major, mymajor);
	}
	~Student() {
		delete[]major;
	}
	void ShowData() const
	{
		cout << "�̸�: " << name << endl;
		cout << "����: " << age << endl;
		cout << "����: " << major << endl;
		cout << endl;
	}
};

class StudentManager
{
private:
	int index;
	Student* List[50];
public:
	StudentManager() : index(0) {}
	bool AddStudent(const Student& std) {
		if (index >= 50) {
			return false;
		}
		List[index++] = new Student(std);
	}
	void addStudent() //�л� �߰� �Լ�
	{
		char name[100];
		int age;
		char major[100];

		cout << "[Add new student]" << endl;
		cout << "- name : "; cin >> name;
		cout << "- age : "; cin >> age;
		cout << "- major : "; cin >> major;

		AddStudent(Student(name, age, major));

		Student* std = new Student(name, age, major);
	}
	void ShowAll() const {
		cout << "[Show All Student]"<< endl;
		for (int i = 0; i < index; i++) {
			List[i]->ShowData();
		}
	}
	~StudentManager()
	{
		for (int i = 0; i < index; i++) {
			delete List[i];
		}
	}
};

class MainMenu {
private:
	int select;
public:
	int IssueMenu(){
		int select;

		cout << "----------< Main Menu>----------" << endl;
		cout << "1. Add a student" << endl;
		cout << "2. Display All student" << endl;
		cout << "0. Exit" << endl;
		std::cout << "Your Choice >> ";
		std::cin >> select;

		return select;
	}
};

class MainCtrl : public MainMenu, public StudentManager {
public:
	MainCtrl() {
		main();
	}
	void main(){
		StudentManager sm;
		MainMenu mm;
		int n = 1;

		while (n != 0) {
			n = mm.IssueMenu();

			switch (n) {
				case 1:
					sm.addStudent();
					break;
				case 2:
					sm.ShowAll();
					break;
				case 0:
					cout << "Exit!" << endl;
					break;
				default: { // 1,2,0 �̿��� ������
					cout << "No such menu item." << endl;
					cout << "" << endl;
					break;
				}
			}

			if (n == 0) { // 0 ���� �� while�� ����
				break;
			}
		}
	}
	int menu() {
		IssueMenu();
	}
};

MainCtrl mc;

void main () {
}
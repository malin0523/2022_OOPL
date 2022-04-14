#include <iostream>
#pragma warning(disable : 4996) 
using namespace std;

class MyFriendInfo {
private:
	char* name;
	int age;
public:
	MyFriendInfo(char* friendname, int friendage) : age(friendage) {
		name = new char[strlen(friendname) + 1];
		strcpy(name, friendname);
		age = friendage;
		cout << "MyFriendInfo() -> �̸� : " << name << " ���� : " << age << endl << endl;
	}
	void showInfo() {
		cout << "�̸� : " << name << endl;
		cout << "���� : " << age << endl;

	}
	~MyFriendInfo() {
		cout << "~MyFriendInfo() -> �̸� : " << name << " ���� : " << age << endl << endl;
		delete[]name;
	}
};

class MyFriendDetailInfo : public MyFriendInfo {
private:
	char* addr;
	char* phone;
public:
	MyFriendDetailInfo(char * friendname, int friendage, char* friendaddr, char* friendphone) : MyFriendInfo(friendname, friendage){
		addr = new char[strlen(friendaddr) + 1];
		strcpy(addr, friendaddr);

		phone = new char[strlen(friendphone) + 1];
		strcpy(phone, friendphone);

		cout << "MyFriendDetailInfo() -> �ּ� : " << addr << " ��ȭ��ȣ : " << phone << endl << endl;
	}
	void showDetailInfo() {
		showInfo();
		cout << "�ּ� : " << addr << endl;
		cout << "��ȭ��ȣ : " << phone << endl << endl;
	}	
	~MyFriendDetailInfo() {
		cout << "~MyFriendDetailInfo() -> �ּ� : " << addr << " ��ȭ��ȣ : " << phone << endl << endl;
		delete[]addr;
		delete[]phone;
	}
};

int main() {
	MyFriendDetailInfo fr1("�����", 25, "��õ", "010-1234-5678");

	fr1.showDetailInfo();

	return 0;

}
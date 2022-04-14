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
		cout << "MyFriendInfo() -> 이름 : " << name << " 나이 : " << age << endl << endl;
	}
	void showInfo() {
		cout << "이름 : " << name << endl;
		cout << "나이 : " << age << endl;

	}
	~MyFriendInfo() {
		cout << "~MyFriendInfo() -> 이름 : " << name << " 나이 : " << age << endl << endl;
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

		cout << "MyFriendDetailInfo() -> 주소 : " << addr << " 전화번호 : " << phone << endl << endl;
	}
	void showDetailInfo() {
		showInfo();
		cout << "주소 : " << addr << endl;
		cout << "전화번호 : " << phone << endl << endl;
	}	
	~MyFriendDetailInfo() {
		cout << "~MyFriendDetailInfo() -> 주소 : " << addr << " 전화번호 : " << phone << endl << endl;
		delete[]addr;
		delete[]phone;
	}
};

int main() {
	MyFriendDetailInfo fr1("김범준", 25, "인천", "010-1234-5678");

	fr1.showDetailInfo();

	return 0;

}
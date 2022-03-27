#include <iostream>
using namespace std;

void SwapByValue(int num1, int num2);
void SwapByPointer(int* ptr1, int* ptr2);
void SwapByReference(int& ref1, int& ref2);

//value
void SwapByValue(int num1, int num2)
{
	int temp = num1; // 임시 저장 공간
	num1 = num2;
	num2 = temp;
}

//포인터 사용, 포인터로 접근해서 저장함
void SwapByPointer(int* ptr1, int* ptr2)
{
	int temp = *ptr1; //임시 저장 공간
	*ptr1 = *ptr2;
	*ptr2 = temp;
}

//레퍼런스 사용
void SwapByReference(int& ref1, int& ref2)
{
	int temp = ref1;
	ref1 = ref2;
	ref2 = temp;
}

int main(void)
{
	//값은 num1 = 10, num2 = 20으로 통일
	int vn1 = 10, vn2 = 20; //value number
	int pn1 = 10, pn2 = 20; //pointer number
	int rn1 = 10, rn2 = 20; //reference number

	SwapByValue(vn1, vn2);
	SwapByPointer(&pn1, &pn2);
	SwapByReference(rn1, rn2);

	/*
	결과 : value는 swap 안됨, 나머지 두개는 됨
	*/

	cout << "SwapByValue: num1 = " << vn1 << ", num2 = " << vn2 << endl;
	cout << "SwapByPointer: num2 = " << pn1 << ", num2 = " << pn2 << endl;
	cout << "SwapByReference: num3 = " << rn1 << ", num2 = " << rn2 << endl;

	return 0;
}
#include <iostream>
#include "FruitSeller.h"
using namespace std;

FruitSeller::FruitSeller(const int& aprice, const int& oprice, int anum, int onum, int money)
	:APPLE_PRICE(aprice), ORANGE_PRICE(oprice)
{
	numOfApples = anum;
	numOfOranges = onum;
	myMoney = money;
}
int FruitSeller::SaleApples(int money)
{
	int num = money / APPLE_PRICE;
	numOfApples -= num;
	myMoney += money;
	return num;
}
int FruitSeller::SaleOranges(int money)
{
	int num = money / ORANGE_PRICE;
	numOfOranges -= num;
	myMoney += money;
	return num;
}
void FruitSeller::ShowSalesResult()
{
	cout << "���� ��� : " << numOfApples << "��" << endl;
	cout << "���� ��� : " << numOfOranges << "��" << endl;
	cout << "�Ǹ� ���� : " << myMoney << "��" << endl << endl;
}

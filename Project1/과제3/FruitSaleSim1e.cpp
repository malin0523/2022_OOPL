#include <iostream>
#include "FruitSeller.h"
#include "FruitBuyer.h"
using namespace std;

int main(void)
{
	//��� = 1000��, ������ 1500�� ���� 20��, 10���� ����
	FruitSeller sellerABC(1000, 1500, 20, 10, 0);
	FruitSeller sellerXYZ(1000, 1500, 20, 10, 0);

	FruitBuyer buyerKim, buyerLee; //���� ���� �θ� �����

	buyerKim.InitMembers(5000); // ó���� 5000��
	buyerKim.BuyApples(sellerABC, 2000); // ABC�κ��� ��� 2000�� ��ġ ����
	buyerKim.BuyOranges(sellerXYZ, 3000); // XYZ�κ��� ������ 3000�� ��ġ ����

	buyerLee.InitMembers(3000); // ó���� 3000��
	buyerLee.BuyApples(sellerXYZ, 2000); // ����� ���

	cout << "�Ǹ��� sellerABC ��Ȳ" << endl;
	sellerABC.ShowSalesResult();
	cout << "�Ǹ��� sellerXYZ ��Ȳ" << endl;
	sellerXYZ.ShowSalesResult();

	cout << "������ buyerKim ��Ȳ" << endl;
	buyerKim.ShowBuyResult();
	cout << "������ buyerLee ��Ȳ" << endl;
	buyerLee.ShowBuyResult();

	return 0;
}

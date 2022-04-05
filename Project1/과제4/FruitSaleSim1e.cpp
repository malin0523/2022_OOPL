#include <iostream>
#include "FruitSeller.h"
#include "FruitBuyer.h"
using namespace std;

int main(void)
{
	/*FruitSeller sellerABC, sellerXYZ;
	sellerABC.InitMembers(1000, 1500, 20, 10, 0);
	sellerXYZ.InitMembers(1000, 1500, 20, 10, 0);*/

	FruitSeller sellerABC(1000, 1500, 20, 10, 0);
	FruitSeller sellerXYZ(1000, 1500, 20, 10, 0);

	FruitBuyer buyerKim, buyerLee;

	buyerKim.InitMembers(5000);
	buyerKim.BuyApples(sellerABC, 2000);
	buyerKim.BuyOranges(sellerXYZ, 3000);

	buyerLee.InitMembers(3000);
	buyerLee.BuyApples(sellerXYZ, 2000);

	cout << "���� �Ǹ��� sellerABC�� ��Ȳ" << endl;
	sellerABC.ShowSalesResult();
	cout << "���� �Ǹ��� sellerXYZ�� ��Ȳ" << endl;
	sellerXYZ.ShowSalesResult();

	cout << "���� ������ buyerKim�� ��Ȳ" << endl;
	buyerKim.ShowBuyResult();
	cout << "���� ������ buyerLee�� ��Ȳ" << endl;
	buyerLee.ShowBuyResult();

	return 0;
}

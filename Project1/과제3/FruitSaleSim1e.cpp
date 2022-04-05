#include <iostream>
#include "FruitSeller.h"
#include "FruitBuyer.h"
using namespace std;

int main(void)
{
	//사과 = 1000원, 오렌지 1500원 각각 20개, 10개씩 보유
	FruitSeller sellerABC(1000, 1500, 20, 10, 0);
	FruitSeller sellerXYZ(1000, 1500, 20, 10, 0);

	FruitBuyer buyerKim, buyerLee; //과일 살사람 두명 만들기

	buyerKim.InitMembers(5000); // 처음에 5000원
	buyerKim.BuyApples(sellerABC, 2000); // ABC로부터 사과 2000원 어치 구매
	buyerKim.BuyOranges(sellerXYZ, 3000); // XYZ로부터 오렌지 3000원 어치 구매

	buyerLee.InitMembers(3000); // 처음에 3000원
	buyerLee.BuyApples(sellerXYZ, 2000); // 사과만 샀다

	cout << "판매자 sellerABC 현황" << endl;
	sellerABC.ShowSalesResult();
	cout << "판매자 sellerXYZ 현황" << endl;
	sellerXYZ.ShowSalesResult();

	cout << "구매자 buyerKim 현황" << endl;
	buyerKim.ShowBuyResult();
	cout << "구매자 buyerLee 현황" << endl;
	buyerLee.ShowBuyResult();

	return 0;
}

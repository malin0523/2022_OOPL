#include <iostream>
#include "FruitBuyer.h"
#include "FruitSeller.h"
using namespace std;

int main() {
	FruitSeller seller(1000, 20, 0);
	FruitBuyer buyer;
	buyer.InitMembers(5000);
	buyer.BuyApples(seller, 2000);

	cout << "���� �Ǹ��� ��Ȳ" << endl;
	seller.ShowSalesResult();
	cout << "���� ������ ��Ȳ" << endl;
	buyer.ShowBuyResult();
}
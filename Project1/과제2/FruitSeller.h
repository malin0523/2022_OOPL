#ifndef __FSH__
#define __FSH__

class FruitSeller
{
private:
	const int APPLE_PRICE;
	int numOfApples;
	int myMoney;

public:
	FruitSeller(const int& price, int onum, int money);
	int SaleApples(int money);
	void ShowSalesResult();
};

#endif

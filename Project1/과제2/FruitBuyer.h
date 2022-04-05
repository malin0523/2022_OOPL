#ifndef __FSB__
#define __FSB__
class FruitSeller;

class FruitBuyer
{
	int myMoney;		// private:
	int numOfApples;	// private:

public:
	void InitMembers(int money);
	void BuyApples(FruitSeller& seller, int money);
	void ShowBuyResult();
};

#endif

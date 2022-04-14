#include <iostream>
using namespace std;

class Car {
private:
	int gasolinGauge;
public:
	Car(int n) : gasolinGauge(n) {}
	int GetGasolin() {
		return gasolinGauge;
	}
};

class HybridCar : public Car {
private:
	int electricGauge;
public:
	HybridCar(int g, int e) : Car(g), electricGauge(e){}
	int GetElec() {
		return electricGauge;
	}
};

class HybridWaterCar : public HybridCar {
private:		
	int waterGauge;
public:
	HybridWaterCar(int g, int e, int w) : HybridCar(g, e), waterGauge(w) {}
	void showCurrentGauge() {
		cout << "ÀÜ¿© °¡¼Ö¸° : " << GetGasolin() << endl;
		cout << "ÀÜ¿© Àü±â·® : " << GetElec() << endl;
		cout << "ÀÜ¿© ¿öÅÍ·® : " << waterGauge << endl;
	}
};

int main() {
	HybridWaterCar c1(30, 20, 100);

	c1.showCurrentGauge();
}
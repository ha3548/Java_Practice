package day06;

public class Texi extends Car {

	int totalPrice = 0, basicPrice = 3000;
	// �������̵�->�ý�����
	String master = "PARK";

	Texi() {
		super(); //�θ�Ŭ������ ������ ȣ��
		totalPrice = basicPrice;
	}

	Texi(String master, String model) {
		super.master = master;
		super.model = model;
		// this.master = master; -> �ڱ��ڽ�
	}

	int calPrice(int km) {
		int price = basicPrice + (km * 1000);
		totalPrice = price;
		return price;
	}

	void init_Price() {
		totalPrice = basicPrice;
	}
}

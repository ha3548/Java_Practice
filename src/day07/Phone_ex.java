package day07;

public class Phone_ex {
	public static void main(String[] args) {
		SmartPhone p1 = new SmartPhone("BONG");
		// Phone p2 = new Phone();
		// �߻�Ŭ������ ����X, �θ�Ŭ������ ���Ҹ�!
		// Public,Protected(O) <-> Private(X)

		p1.turnOn();
		p1.internetSearch();
		p1.turnOff();
		p1.sound();
	}

}

package day09.instance;
//p417 4��

class Car {
	class Tire {
	}

	static class Engine {
	}
}

public class NestedClass_ex {
	public static void main(String args[]) {
		Car myCar = new Car();
		Car.Tire tire = myCar.new Tire();// �ν��Ͻ�Ŭ����: ��ü�����ʿ�
		Car.Engine engine = new Car.Engine();// ����Ŭ����: �ٷ�����O
	}
}
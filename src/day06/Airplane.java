package day06;

public class Airplane {
	public void land() {

	}

	public void fly() {
		System.out.println("�Ϲ� ����");
	}

	public void takeoff() {

	}
}

class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flymode = NORMAL;

	@Override
	public void fly() {
		if (flymode == SUPERSONIC) {
			System.out.println("������ ����");
		} else {
			super.fly();
		}
	}
}
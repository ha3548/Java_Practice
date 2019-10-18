package day06_Ex;

public class Exercise3 {
	public static void main(String[] args) {
		Marine m = new Marine();
		Tank t = new Tank();
		Dropship d = new Dropship();
		m.move(2, 3);
		m.stop();
		m.stimPack();
		t.changeMode();
		d.load();
		d.unload();
	}

}

class Unit {
	int x, y;

	void move(int x, int y) {
		System.out.println("��ǥ (" + x + "," + y + ")���� �̵�");
	}

	void stop() {
		System.out.println("��ǥ (" + x + "," + y + ")���� ����");
	}
}

class Marine extends Unit {
	void stimPack() {
		System.out.println("�������� ����մϴ�.");
	}
}

class Tank extends Unit {
	void changeMode() {
		System.out.println("���ݸ�带 ��ȯ�մϴ�.");
	}
}

class Dropship extends Unit {
	void load() {
		System.out.println("���õ� ����� �¿�ϴ�.");
	}

	void unload() {
		System.out.println("���õ� ����� �����ϴ�.");
	}
}
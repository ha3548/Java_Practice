package day06;

public class Unit {
	int hp = 30, x, y;

	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("��ǥ (" + x + "," + y + ")�� �̵��մϴ�.");
	}

	void stop() {
		System.out.println("STOP!");
	}
}

class SCV extends Unit {

	void mine(int x, int y) {
		System.out.println("��ǥ (" + x + "," + y + ")�� �̵��Ͽ� �ڿ��� ä���մϴ�.");
	}

	void attack(SCV scv) {
		System.out.println("ATTACK!");
		if (scv.hp > 10)
			scv.hp -= 10;
		else
			scv.hp = 0;
	}

	void fix(SCV scv) {
		System.out.println("ȸ����...");
		if (scv.hp <= 25)
			scv.hp += 5;
		else {
			scv.hp = 30;
			System.out.println("HP FULL!");
		}
	}

	// OverRide: (��Ӱ���) ����Ŭ�������� �޼ҵ� ������
	void stop() {
		System.out.println("SCV STOP!");
	}
}
